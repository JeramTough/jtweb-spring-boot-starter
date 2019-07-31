package com.novel;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2019/6/26 17:16
 * by @author WeiBoWen
 */
public class NovelClient {

    private OkHttpClient client;
    private Element nextElement, preElement;
    private Recode recode;

    public NovelClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 1080));
        builder.proxy(proxy);
        client = builder.build();

        try {
            FileInputStream fileInputStream = new FileInputStream("./recode.json");
            String jsonStr = IOUtils.toString(fileInputStream, "UTF-8");
            recode = JSON.parseObject(jsonStr, Recode.class);
            if (recode == null) {
                recode = new Recode();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String open(String url) {

        writeRecode(url);

        Request request = new Request.Builder()
                .url(url)
                .build();

        String novel = null;

        try (Response response = client.newCall(request).execute()) {
            String html = response.body().string();
            Document doc = Jsoup.parse(html);
            Elements contentElement = doc.select("#content");
            if (contentElement.size() == 0) {
                contentElement = doc.select("#content");
            }
            novel = contentElement.text();
            String title = doc.select(".bookname h1").text();
            novel = title + "\n" + novel;

            Elements controllerElements = doc.select(".bottem a");
            for (Element element : controllerElements) {
                if ("上一章".equals(element.text())) {
                    preElement = element;
                }
                else if ("下一章".equals(element.text())) {
                    nextElement = element;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        novel = splitTextByCounterOfRow(novel, 60);
        return novel;
    }

    public String next() {
        String url = nextElement.attr("href");
        return open(url);
    }

    public String pre() {
        String url = preElement.attr("href");
        return open(url);
    }

    public Recode getRecode() {
        return recode;
    }

    //*************

    private String splitTextByCounterOfRow(String originalText, int limitNumber) {
        if (limitNumber <= 0) {
            return originalText;
        }

        String[] texts = originalText.split("\n");
        List<String> newTexts = new ArrayList();
        StringBuilder newText = new StringBuilder();
        int position;
        int howManySection;
        for (String text : texts) {
            if (text.length() > limitNumber) {
                position = 0;
                howManySection = text.length() / limitNumber + 1;
                for (int i = 0; i < howManySection; i++) {
                    if (i != howManySection - 1) {
                        //if this per isn't last section
                        newTexts.add(text.substring(position, position + limitNumber));
                        position = position + limitNumber;
                    }
                    else {
                        newTexts.add(text.substring(position, text.length()));
                    }
                }
            }
            else {
                newTexts.add(text);
            }
        }

        for (int i = 0; i < newTexts.size(); i++) {
            newText.append(newTexts.get(i));
            if (i != newTexts.size() - 1) {
                newText.append("\n");
            }
        }

        return newText.toString();
    }

    private void writeRecode(String url) {
        recode.setCurrentUrl(url);
        try {
            IOUtils.write(JSON.toJSONString(recode, true),
                    new FileOutputStream(new File("./recode.json")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
