package springtest;

import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.filesaver.config.upload.oss.OssSettingAdapter;
import com.jeramtough.jtweb.component.filesaver.upload.oss.OssClient;
import com.jeramtough.jtweb.component.filesaver.upload.oss.ali.AliOssClient;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * Created on 2022/3/27 上午3:32
 * by @author WeiBoWen
 * </pre>
 */
public class OssTest {

    @Test
    public void test1() {
        OssClient ossClient = new AliOssClient(new OssSettingAdapter() {
            @Override
            public String getEndpoint() {
                return "https://oss-cn-guangzhou.aliyuncs.com";
            }

            @Override
            public String getBucketName() {
                return "qacar";
            }

            @Override
            public String getAccessKeyBase64() {
                return "xLTlBpiwrfUTUNFSBDq9FeVsDEb98RmkduNK5asYi44=";
            }

            @Override
            public String getSecretBase64() {
                return "6vJD5b2QxjudgzXZut6BAUoz2xqae7EAW4W13Q2H9d0=";
            }

            @Override
            public String getOssPath() {
                return "";
            }

            @Override
            public Boolean getAfterDelete() {
                return false;
            }
        });
        ossClient.open();

        ossClient.upload(new File("/var/upload-file/image/banner/banner2.jpg"),
                "banner" + File.separator + "banner2.jpg");

        L.arrive();


        ossClient.shutdown();
    }

    @Test
    public void test2() {
        OssClient ossClient = new AliOssClient(new OssSettingAdapter() {
            @Override
            public String getEndpoint() {
                return "https://oss-cn-guangzhou.aliyuncs.com";
            }

            @Override
            public String getBucketName() {
                return "qacar";
            }

            @Override
            public String getAccessKeyBase64() {
                return "xLTlBpiwrfUTUNFSBDq9FeVsDEb98RmkduNK5asYi44=";
            }

            @Override
            public String getSecretBase64() {
                return "6vJD5b2QxjudgzXZut6BAUoz2xqae7EAW4W13Q2H9d0=";
            }

            @Override
            public String getOssPath() {
                return "";
            }

            @Override
            public Boolean getAfterDelete() {
                return false;
            }
        });
        ossClient.open();


        List<String> fileList = ossClient.ls("/car/11/");
        L.arrive();


        ossClient.shutdown();
    }

    @Test
    public void test3() {
        OssClient ossClient = new AliOssClient(new OssSettingAdapter() {
            @Override
            public String getEndpoint() {
                return "https://oss-cn-guangzhou.aliyuncs.com";
            }

            @Override
            public String getBucketName() {
                return "qacar";
            }

            @Override
            public String getAccessKeyBase64() {
                return "xLTlBpiwrfUTUNFSBDq9FeVsDEb98RmkduNK5asYi44=";
            }

            @Override
            public String getSecretBase64() {
                return "6vJD5b2QxjudgzXZut6BAUoz2xqae7EAW4W13Q2H9d0=";
            }

            @Override
            public String getOssPath() {
                return "";
            }

            @Override
            public Boolean getAfterDelete() {
                return false;
            }
        });
        ossClient.open();


        for (int i = 11; i <= 48; i++) {
            String relativePath = "/car/" + i + "/";
            String savePath = "/var/upload-file/image/";
            List<String> fileList = ossClient.ls(relativePath);
            for (String path : fileList) {
                String newFilePath = savePath + path;
                try {
                    ossClient.download(new File(newFilePath), path);
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }


        ossClient.shutdown();
    }

    @Test
    public void test4() {
        OssClient ossClient = new AliOssClient(new OssSettingAdapter() {
            @Override
            public String getEndpoint() {
                return "https://oss-cn-guangzhou.aliyuncs.com";
            }

            @Override
            public String getBucketName() {
                return "qacar1";
            }

            @Override
            public String getAccessKeyBase64() {
                return "QpCRrL3xxRiHV5yIANvvxKZnvTj6MPNMsMqfUz4JfpA=";
            }

            @Override
            public String getSecretBase64() {
                return "GUKZEXT4WmpIIhM6gNxBjrG0BRWUlpnWX+3gOlz7uv0=";
            }

            @Override
            public String getOssPath() {
                return "";
            }

            @Override
            public Boolean getAfterDelete() {
                return false;
            }
        });
        ossClient.open();


        for (int i = 11; i <= 48; i++) {
            String relativePath = "/car/" + i + "/";
            String savePath = "/var/upload-file/image/";

            if (!new File(savePath+"car/"+i).exists()){
                continue;
            }

            Directory directory=new Directory(savePath+"car/"+i);
            for (File file : directory.listFiles()) {
                relativePath="car/"+i+"/"+file.getName();
                ossClient.upload(file,relativePath);
            }
        }


        ossClient.shutdown();
    }

    @Test
    public void test5() {
        OssClient ossClient = new AliOssClient(new OssSettingAdapter() {
            @Override
            public String getEndpoint() {
                return "https://oss-cn-guangzhou.aliyuncs.com";
            }

            @Override
            public String getBucketName() {
                return "qacar1";
            }

            @Override
            public String getAccessKeyBase64() {
                return "QpCRrL3xxRiHV5yIANvvxKZnvTj6MPNMsMqfUz4JfpA=";
            }

            @Override
            public String getSecretBase64() {
                return "GUKZEXT4WmpIIhM6gNxBjrG0BRWUlpnWX+3gOlz7uv0=";
            }

            @Override
            public String getOssPath() {
                return "surface_image";
            }

            @Override
            public Boolean getAfterDelete() {
                return false;
            }
        });
        ossClient.open();


      ossClient.delete("/surface_image/10/head_b90uh.png");


        ossClient.shutdown();
    }

}
