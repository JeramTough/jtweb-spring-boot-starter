package com.jeramtough.jtweb.component.filesaver.upload.cleartask;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileNameUtil;
import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtweb.component.filesaver.upload.named.UploadFileNamed;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/12/3 下午2:35
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultRemoveUndeterminedTask implements RemoveUndeterminedTask {

    private final Directory savedFileDirectory;
    private final UploadFileNamed uploadFileNamed;
    private final long removePeriod;

    public DefaultRemoveUndeterminedTask(
            Directory savedFileDirectory,
            UploadFileNamed uploadFileNamed, long removePeriod) {
        this.savedFileDirectory = savedFileDirectory;
        this.uploadFileNamed = uploadFileNamed;
        this.removePeriod = removePeriod;
    }

    @Override
    public void run() {
        Objects.requireNonNull(savedFileDirectory);
        File[] subFiles = savedFileDirectory.listFiles();
        if (subFiles == null) {
            return;
        }

        for (File file : subFiles) {

            //文件名不包含清除标记的就跳过
            String mainName = FileNameUtil.mainName(file);
            if (!mainName.contains(uploadFileNamed.getUndeterminedSuffix())) {
                continue;
            }

            //时间周期小于一个周期的跳过
            Date lastModifiedTime = FileUtil.lastModifiedTime(file);
            Date now = new Date();
            long betweenTime = DateUtil.between(lastModifiedTime, now,
                    DateUnit.SECOND, true);
            if (betweenTime < removePeriod) {
                continue;
            }

            boolean isOk = file.delete();
            if (isOk) {
                getLogger().debug(() -> "v：定时清理文件任务，成功清理【%s】", file.getAbsolutePath());
            }
            else {
                getLogger().warn(() -> "x：定时清理文件任务，失败清理【%s】", file.getAbsolutePath());
            }
        }
    }
}
