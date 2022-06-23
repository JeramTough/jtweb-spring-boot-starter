package com.jeramtough.jtweb.component.filesaver.upload.oss.ali;

import cn.hutool.core.io.IoUtil;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.jeramtough.jtcomponent.utils.JtIoUtil;
import com.jeramtough.jtweb.component.filesaver.config.upload.oss.OssSettingAdapter;
import com.jeramtough.jtweb.component.filesaver.upload.oss.BaseOssClient;
import com.jeramtough.jtweb.component.filesaver.upload.oss.OssClient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * Created on 2022/3/27 上午2:56
 * by @author WeiBoWen
 * </pre>
 */

public class AliOssClient extends BaseOssClient implements OssClient {

    private OSS ossClient;

    public AliOssClient(
            OssSettingAdapter settingAdapter) {
        super(settingAdapter);
    }

    @Override
    public void open() {
// 创建OSSClient实例。
        ossClient = new OSSClientBuilder().build(getSettingAdapter().getEndpoint(),
                getAccessKey(),
                getGetSecret());
    }

    @Override
    public void shutdown() {
        // 关闭OSSClient。
        if (ossClient != null) {
            ossClient.shutdown();
        }
    }

    @Override
    public void upload(File file, String relativePath) throws OSSException, ClientException {
        this.checkClient();
        relativePath = getFormatRelativePath(relativePath);
        ossClient.putObject(getSettingAdapter().getBucketName(), relativePath, file);
    }

    @Override
    public void download(File savedFile, String relativePath) throws FileNotFoundException
            , OSSException {
        this.checkClient();
        relativePath = getFormatRelativePath(relativePath);

        // 调用ossClient.getObject返回一个OSSObject实例，该实例包含文件内容及文件元信息。
        OSSObject ossObject = ossClient.getObject(getSettingAdapter().getBucketName()
                , relativePath);
        // 调用ossObject.getObjectContent获取文件输入流，可读取此输入流获取其内容。
        InputStream inputStream = ossObject.getObjectContent();

        if (!savedFile.getParentFile().exists()) {
            savedFile.getParentFile().mkdirs();
        }
        IoUtil.copy(inputStream, new FileOutputStream(savedFile));
    }

    @Override
    public List<String> ls(String relativeDir) throws OSSException {
        this.checkClient();
        relativeDir = getFormatRelativeDirPath(relativeDir);

        // ossClient.listObjects返回ObjectListing实例，包含此次listObject请求的返回结果。
        ObjectListing objectListing = ossClient.listObjects(
                getSettingAdapter().getBucketName(), relativeDir);
        // objectListing.getObjectSummaries获取所有文件的描述信息。
        List<String> ls = new ArrayList<>();
        for (OSSObjectSummary objectSummary : objectListing.getObjectSummaries()) {
            if (!objectSummary.getKey().equals(relativeDir)) {
                ls.add(objectSummary.getKey());
            }
        }
        return ls;
    }

    @Override
    public void delete(String relativePath) throws OSSException, ClientException {
        this.checkClient();
        relativePath = getFormatRelativePath(relativePath);
        // 删除文件。
        ossClient.deleteObject(getSettingAdapter().getBucketName()
                , relativePath);
    }

    //****************

    private void checkClient() {
        if (this.ossClient == null) {
            throw new IllegalStateException("The client don't be opened");
        }
    }

    private String getFormatRelativePath(String relativePath) {
        File file = new File(File.separator + relativePath);
        String path = file.getAbsolutePath();
        if (path.length() > 0 && path.startsWith(File.separator)) {
            path = path.substring(1);
        }
        return path;
    }

    private String getFormatRelativeDirPath(String relativeDir) {
        String path = getFormatRelativePath(relativeDir);
        if (!path.endsWith(File.separator)) {
            path = path + File.separator;
        }
        return path;
    }

}
