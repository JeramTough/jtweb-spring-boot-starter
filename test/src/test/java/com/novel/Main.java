package com.novel;

import com.jeramtough.jtlog.facade.L;

import java.util.Scanner;

/**
 * Created on 2019/6/27 16:35
 * by @author WeiBoWen
 */
public class Main {

    public static void main(String[] args) {

        Scanner Inport = new Scanner(System.in);
        NovelClient novelClient = new NovelClient();

        L.info("start  url=?");
        String url;
        if (novelClient.getRecode().getCurrentUrl() == null || novelClient.getRecode().getCurrentUrl().length() == 0) {
            url = Inport.next();
            url = url.substring(1);
        }
        else {
            url = novelClient.getRecode().getCurrentUrl();
        }

        String novel = novelClient.open(url);
        L.info(novel);
        for (; ; ) {
            L.p("1、上一章, 2、下一章,3、重设url，4、退出");
            String option = Inport.next();
            switch (option) {
                case "1":
                    novel = novelClient.pre();
                    break;
                case "2":
                    novel = novelClient.next();
                    break;
                case "3":
                    L.info("url=?");
                    url = Inport.next();
                    url = url.substring(1);
                    novel = novelClient.open(url);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    break;
            }
            L.info(novel);
        }
    }
}
