package com.jeramtough.jtweb.component.filereader.image;

import cn.hutool.core.io.file.FileNameUtil;
import com.jeramtough.jtlog.with.WithLogger;
import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.math.BigDecimal;

/**
 * <pre>
 * Created on 2021/2/7 15:16
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultImageManager implements ImageManager, WithLogger {


    @Override
    public File get(File imageFile, int imageQuality) {
        if (!imageFile.exists()) {
            return null;
        }

        //如果有已经压缩后的图片文件就直接返回，否则压缩并保存
        String compressedImageFileName =
                FileNameUtil.mainName(imageFile) + "_quality" + imageQuality + "." + FileNameUtil.extName(
                        imageFile);
        File compressedImageFile =
                new File(imageFile.getParentFile().getAbsolutePath() + File.separator + compressedImageFileName);
        if (compressedImageFile.exists()) {
            return compressedImageFile;
        }
        else {
            try {
                //如果是100就不缩放
                if (100 == imageQuality) {
                    return imageFile;
                }
                //缩放系数
                float f = (BigDecimal.valueOf(imageQuality).divide(BigDecimal.valueOf(100), 1,
                        BigDecimal.ROUND_HALF_DOWN).floatValue());

                //压缩图片框架加载图片
                Thumbnails.of(imageFile)
                          //设置缩放
                          .scale(f)
                          //设置图片质量
                          .outputQuality(f)
                          //输出
                          .toFile(compressedImageFile);

                getLogger().info(
                        "图片压缩成功！大小为【" + compressedImageFile.length() + "】，输出：" + compressedImageFile.getAbsolutePath());
                return compressedImageFile;
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }

        return imageFile;


    }

}
