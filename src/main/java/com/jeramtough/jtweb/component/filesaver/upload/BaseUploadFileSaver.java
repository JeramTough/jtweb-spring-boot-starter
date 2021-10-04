package com.jeramtough.jtweb.component.filesaver.upload;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.RandomUtil;
import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.filesaver.base.BaseFileSaver;
import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdaper;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2021/9/15 上午10:00
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseUploadFileSaver extends BaseFileSaver<MultipartFile>
        implements UploadFileSaver {

    private final static Pattern VAR_PATTERN = Pattern.compile("\\$\\{[\\S]+}");

    private final UploadFileSaveConfigAdaper fileSaveConfigAdapter;


    public BaseUploadFileSaver(
            UploadFileSaveConfigAdaper fileSaveConfigAdapter) {
        super(fileSaveConfigAdapter);
        this.fileSaveConfigAdapter = fileSaveConfigAdapter;
    }

    @Override
    public File save(MultipartFile file) throws IOException, MaxSizeLimitException,
            IllegalFileTypeException, SaveFileException {
        if (file.isEmpty()) {
            throw new IOException("上传大小为0");
        }
        //图片大小不允许超过500kb
        if (file.getSize() > 1024L * fileSaveConfigAdapter.getMaxSize()) {
            throw new MaxSizeLimitException(file.getName());
        }

        Set<String> allowFileTypeSet =
                StringUtil.splitByComma(
                        fileSaveConfigAdapter.getType()).parallelStream().collect(
                        Collectors.toSet());

        boolean isAllowFileType = allowFileTypeSet.contains(file.getContentType());

        if (!isAllowFileType) {
            throw new IllegalFileTypeException(file.getName());
        }

        checkFile(file);

        File productFile = saveFile(file);
        if (!productFile.exists()) {
            throw new SaveFileException(file.getName());
        }
        return productFile;
    }

    public abstract void checkFile(MultipartFile file);

    public abstract File saveFile(MultipartFile file) throws IOException;

    public Directory getTempDir() throws IOException {
        String path = fileSaveConfigAdapter.getPath() + File.separator + "temp";
        File dir = new File(path);
        if (!dir.exists()) {
            boolean isOk = dir.mkdirs();
            if (!isOk) {
                throw new IOException("创建文件夹失败:" + dir.getAbsolutePath());
            }
        }
        Directory tempDir = new Directory(path);
        return tempDir;
    }

    public Directory getSaveDir() throws IOException {
        LocalDateTime nowTime = LocalDateTime.now();
        String year = LocalDateTimeUtil.format(nowTime, "yyyy");
        String month = LocalDateTimeUtil.format(nowTime, "MM");
        String day = LocalDateTimeUtil.format(nowTime, "dd");

        String path = fileSaveConfigAdapter.getPath() + File.separator + year
                + File.separator + month + File.separator + day + File.separator;
        File dir = new File(path);
        if (!dir.exists()) {
            boolean isOk = dir.mkdirs();
            if (!isOk) {
                throw new IOException("创建文件夹失败:" + dir.getAbsolutePath());
            }
        }

        Directory saveDir = new Directory(path);
        return saveDir;
    }

    public String getRandomFilePrefix() {
        LocalDateTime time = LocalDateTime.now();
        String name =
                LocalDateTimeUtil.format(time,
                        "yyyyMMddHHmmss") + "_" + RandomUtil.randomString(3);
        return name;
    }

}
