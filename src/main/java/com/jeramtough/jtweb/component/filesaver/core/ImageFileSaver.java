package com.jeramtough.jtweb.component.filesaver.core;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.filesaver.config.ImageFileSaveConfigAdapter;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * Created on 2021/9/15 上午9:32
 * by @author WeiBoWen
 * </pre>
 */
public class ImageFileSaver extends BaseFileSaver implements FileSaver, WithLogger {

    private final ImageFileSaveConfigAdapter imageFileSaveConfigAdapter;

    public ImageFileSaver(
            ImageFileSaveConfigAdapter imageFileSaveConfigAdapter) {
        super(imageFileSaveConfigAdapter);
        this.imageFileSaveConfigAdapter = imageFileSaveConfigAdapter;
    }

    @Override
    public void checkFile(MultipartFile file) {
        //不用做额外的校验
    }

    @Override
    public File saveFile(MultipartFile file) throws IOException {
        String imageFileName = getRandomFilePrefix() + "." + imageFileSaveConfigAdapter.getSaveExtname();
        File compressedImageFile = new File(getSaveDir() + File.separator + imageFileName);
        try {
            InputStream inputStream = new ByteArrayInputStream(file.getBytes());
            //压缩图片框架加载图片
            Thumbnails.Builder<? extends InputStream> builder = Thumbnails.of(inputStream);

            //设置大小
            if (imageFileSaveConfigAdapter.getResetHeight() > 0 && imageFileSaveConfigAdapter.getResetWidth() > 0) {
                builder = builder.forceSize(imageFileSaveConfigAdapter.getResetWidth(),
                        imageFileSaveConfigAdapter.getResetHeight());
            }

            //输出
            builder.toFile(compressedImageFile);

            getLogger().debug(
                    "图片压缩成功！大小为【" + compressedImageFile.length() + " kb】，保存在：" + compressedImageFile.getAbsolutePath());

            return compressedImageFile;
        }
        catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }
}
