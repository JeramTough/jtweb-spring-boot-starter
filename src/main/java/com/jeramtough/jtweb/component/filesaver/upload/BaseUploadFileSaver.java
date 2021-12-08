package com.jeramtough.jtweb.component.filesaver.upload;

import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.filesaver.base.BaseFileSaver;
import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.directory.TimeFormatDirectory;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.ReNameFileException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;
import com.jeramtough.jtweb.component.filesaver.upload.cleartask.DefaultRemoveUndeterminedTask;
import com.jeramtough.jtweb.component.filesaver.upload.cleartask.RemoveUndeterminedTask;
import com.jeramtough.jtweb.component.filesaver.upload.named.ImageUploadFileNamed;
import com.jeramtough.jtweb.component.filesaver.upload.named.UploadFileNamed;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 上传文件保存器，比起基础文件保存器，多了定时清理功能
 *
 * <pre>
 * Created on 2021/9/15 上午10:00
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseUploadFileSaver extends BaseFileSaver<MultipartFile>
        implements UploadFileSaver {

    /**
     * 延时一分钟后执行清除图片任务
     */
    public static final long REMOVE_UNDETERMINED_TASK_INITIAL_DELAY = 60L;

    private final UploadFileSaveConfigAdapter fileSaveConfigAdapter;
    private final UploadFileNamed uploadFileNamed;


    public BaseUploadFileSaver(
            UploadFileSaveConfigAdapter fileSaveConfigAdapter) {
        super(fileSaveConfigAdapter);
        this.fileSaveConfigAdapter = fileSaveConfigAdapter;

        uploadFileNamed = new ImageUploadFileNamed(fileSaveConfigAdapter);

        init();
    }


    protected void init() {

        //初始化定时删除未确定图片任务，如果配置开启才开启
        if (fileSaveConfigAdapter.allowRemoveUndeterminedOnScheme() != null && fileSaveConfigAdapter.allowRemoveUndeterminedOnScheme()) {
            try {
                RemoveUndeterminedTask removeUndeterminedTask =
                        new DefaultRemoveUndeterminedTask(getSaveDir(), getUploadFileNamed(),
                                fileSaveConfigAdapter.getRemoveUndeterminedPeriod());

                getScheduledExecutorService().scheduleAtFixedRate(removeUndeterminedTask,
                        REMOVE_UNDETERMINED_TASK_INITIAL_DELAY,
                        fileSaveConfigAdapter.getRemoveUndeterminedPeriod(),
                        TimeUnit.SECONDS);
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }

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

    @Override
    public File determined(String relativePath) throws NoSuchFileException {
        File file = read(relativePath);
        String str =
                getUploadFileNamed().getBoundSymbol() + getUploadFileNamed().getUndeterminedSuffix();
        String oldName = file.getName();
        String newName = oldName.replace(str, "");
        File newFile = new File(
                file.getParentFile().getAbsolutePath() + File.separator + newName);
        boolean isOk = file.renameTo(newFile);

        if (!isOk) {
            throw new ReNameFileException(file.getAbsolutePath());
        }

        return newFile;
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

    public UploadFileSaveConfigAdapter getFileSaveConfig() {
        return fileSaveConfigAdapter;
    }

    /**
     * 上传图片的文件夹是写死的，年月日划分
     */
    public Directory getSaveDir() throws IOException {
        TimeFormatDirectory timeFormatDirectory =
                new TimeFormatDirectory(fileSaveConfigAdapter.getPath());
        return timeFormatDirectory.get();
    }

    /**
     * 文件名命名器
     */
    public UploadFileNamed getUploadFileNamed() {
        return uploadFileNamed;
    }


}
