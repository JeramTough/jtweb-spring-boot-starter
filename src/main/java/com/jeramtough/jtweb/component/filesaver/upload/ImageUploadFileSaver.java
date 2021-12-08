package com.jeramtough.jtweb.component.filesaver.upload;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.filesaver.config.upload.ImageUploadFileSaveConfigAdapter;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * <pre>
 * Created on 2021/9/15 上午9:32
 * by @author WeiBoWen
 * </pre>
 */
public class ImageUploadFileSaver extends BaseUploadFileSaver
        implements UploadFileSaver, WithLogger {

    private final ImageUploadFileSaveConfigAdapter imageFileSaveConfigAdapter;

    public ImageUploadFileSaver(
            ImageUploadFileSaveConfigAdapter imageFileSaveConfigAdapter) {
        super(imageFileSaveConfigAdapter);
        this.imageFileSaveConfigAdapter = imageFileSaveConfigAdapter;
    }

    @Override
    public void checkFile(MultipartFile file) {
        //不用做额外的校验
    }

    @Override
    public File saveFile(MultipartFile file) throws IOException {
        //生成上传图片生成的名字
        String imageFileName =
                getUploadFileNamed().getCompletedName() + "." + imageFileSaveConfigAdapter.getSaveExtname();

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
            else {
                double scale = new BigDecimal(imageFileSaveConfigAdapter.getScale())
                        .divide(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_DOWN)
                        .doubleValue();
                builder = builder.scale(scale);
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


    public ImageUploadFileSaveConfigAdapter getImageFileSaveConfig() {
        return imageFileSaveConfigAdapter;
    }
}
