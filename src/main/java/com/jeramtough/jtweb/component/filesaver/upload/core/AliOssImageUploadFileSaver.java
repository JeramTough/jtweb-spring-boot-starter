package com.jeramtough.jtweb.component.filesaver.upload.core;

import com.jeramtough.jtcomponent.exception.UndoneException;
import com.jeramtough.jtweb.component.filesaver.config.upload.oss.OssImageUploadFileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;
import com.jeramtough.jtweb.component.filesaver.upload.named.UploadFileNamed;
import com.jeramtough.jtweb.component.filesaver.upload.oss.OssClient;
import com.jeramtough.jtweb.component.filesaver.upload.oss.ali.AliOssClient;
import com.jeramtough.jtweb.component.filesaver.upload.path.PathStrategy;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Map;

/**
 * <pre>
 * Created on 2022/3/27 上午1:44
 * by @author WeiBoWen
 * </pre>
 */
public class AliOssImageUploadFileSaver extends ImageUploadFileSaver {

    private final OssImageUploadFileSaveConfigAdapter ossImageUploadFileSaveConfigAdapter;

    private OssClient ossClient;

    public AliOssImageUploadFileSaver(
            OssImageUploadFileSaveConfigAdapter ossImageUploadFileSaveConfigAdapter) {
        super(ossImageUploadFileSaveConfigAdapter);
        this.ossImageUploadFileSaveConfigAdapter = ossImageUploadFileSaveConfigAdapter;
        this.thisInit();
    }

    public AliOssImageUploadFileSaver(
            OssImageUploadFileSaveConfigAdapter ossImageUploadFileSaveConfigAdapter,
            UploadFileNamed uploadFileNamed,
            PathStrategy pathStrategy) {
        super(ossImageUploadFileSaveConfigAdapter, uploadFileNamed, pathStrategy);
        this.ossImageUploadFileSaveConfigAdapter = ossImageUploadFileSaveConfigAdapter;
        this.thisInit();
    }

    public AliOssImageUploadFileSaver(
            OssImageUploadFileSaveConfigAdapter ossImageUploadFileSaveConfigAdapter,
            UploadFileNamed uploadFileNamed) {
        super(ossImageUploadFileSaveConfigAdapter, uploadFileNamed);
        this.ossImageUploadFileSaveConfigAdapter = ossImageUploadFileSaveConfigAdapter;
        this.thisInit();
    }

    public AliOssImageUploadFileSaver(
            OssImageUploadFileSaveConfigAdapter ossImageUploadFileSaveConfigAdapter,
            PathStrategy pathStrategy) {
        super(ossImageUploadFileSaveConfigAdapter, pathStrategy);
        this.ossImageUploadFileSaveConfigAdapter = ossImageUploadFileSaveConfigAdapter;
        this.thisInit();
    }

    protected void thisInit() {
        if (this.ossImageUploadFileSaveConfigAdapter != null) {
            ossClient = new AliOssClient(
                    ossImageUploadFileSaveConfigAdapter.getOssSetting());
        }
    }

    @Override
    public File save(MultipartFile file,
                     Map<String, Object> params) throws IOException, MaxSizeLimitException,
            IllegalFileTypeException, SaveFileException {
        File savedFile = super.save(file, params);

        getLogger().debug("开始进行oss上传,");

        //开始进行oss上传
        try {
            ossClient.open();
            String ossRelativePath =
                    File.separator +
                            ossImageUploadFileSaveConfigAdapter
                                    .getOssSetting().getOssPath() + File.separator
                            + getPathStrategy().getPath(params) + File.separator
                            + savedFile.getName();
            ossRelativePath = new File(ossRelativePath).getAbsolutePath();
            getLogger().debug("oss路径为 %s", ossRelativePath);
            ossClient.upload(savedFile, ossRelativePath);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ossClient.shutdown();

            //上传完成，就把源图删除
            if (ossImageUploadFileSaveConfigAdapter.getOssSetting().getAfterDelete() != null &&
                    ossImageUploadFileSaveConfigAdapter.getOssSetting().getAfterDelete()) {
                savedFile.delete();
            }

        }
        return savedFile;
    }

    @Override
    public File read(String relativePath) throws NoSuchFileException {
        throw new UndoneException();
    }

    @Override
    public File readAndDefault(String relativePath) {
        throw new UndoneException();
    }

    @Override
    public void delete(String relativePath) throws NoSuchFileException {
        //直接删除oss上的文件
        try {
            ossClient.open();
            relativePath=File.separator+
                    ossImageUploadFileSaveConfigAdapter.getOssSetting().getOssPath()+relativePath;
            ossClient.delete(relativePath);
            getLogger().debug("删除oss上的【%s】完成！",relativePath);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ossClient.shutdown();
        }
    }

    public OssClient getOssClient() {
        return ossClient;
    }
}
