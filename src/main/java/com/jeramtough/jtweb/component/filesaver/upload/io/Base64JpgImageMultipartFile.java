package com.jeramtough.jtweb.component.filesaver.upload.io;

import cn.hutool.core.io.IoUtil;
import com.jeramtough.jtcomponent.io.Directory;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.DatatypeConverter;
import java.io.*;

/**
 * <pre>
 * Created on 2022/5/10 下午7:01
 * by @author WeiBoWen
 * </pre>
 */
public class Base64JpgImageMultipartFile implements MultipartFile {
    private String base64;
    private File imageFile;

    public Base64JpgImageMultipartFile(String base64) {
        this.base64 = base64;

        FileOutputStream fops = null;
        base64 = base64.replace("data:image/jpeg;base64,", "");
        byte[] buff = DatatypeConverter.parseBase64Binary(base64);
        try {
            String systemTempDirStr = System.getProperty("java.io.tmpdir")+File.separator+
                    "qacar_temp";
            Directory sytemTempDir=new Directory(systemTempDirStr,true);

            imageFile = File.createTempFile(System.currentTimeMillis() + "", ".jpg",
                    sytemTempDir);
            fops = new FileOutputStream(imageFile);
            fops.write(buff);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fops != null) {
                try {
                    fops.close();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @Override
    public String getName() {
        return imageFile.getName();
    }

    @Override
    public String getOriginalFilename() {
        return imageFile.getName();
    }

    @Override
    public String getContentType() {
        return "image/jpeg";
    }

    @Override
    public boolean isEmpty() {
        return !imageFile.exists();
    }

    @Override
    public long getSize() {
        return imageFile.length();
    }

    @Override
    public byte[] getBytes() throws IOException {
        return IoUtil.readBytes(new FileInputStream(imageFile));
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(imageFile);
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {
        IoUtil.copy(new FileInputStream(imageFile), new FileOutputStream(dest));
    }
}
