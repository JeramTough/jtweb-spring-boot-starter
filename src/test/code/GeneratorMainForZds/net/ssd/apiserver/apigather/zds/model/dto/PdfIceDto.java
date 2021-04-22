package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-03-08
 */
@ApiModel(value="PdfIce对象", description="")
public class PdfIceDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String pid;

    private String templateid;

    private String filename;

    private String filepath;

    private Integer status;

    private byte[] fileblob;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public byte[] getFileblob() {
        return fileblob;
    }

    public void setFileblob(byte[] fileblob) {
        this.fileblob = fileblob;
    }

    @Override
    public String toString() {
        return "PdfIce{" +
        "id=" + id +
        ", pid=" + pid +
        ", templateid=" + templateid +
        ", filename=" + filename +
        ", filepath=" + filepath +
        ", status=" + status +
        ", fileblob=" + fileblob +
        "}";
    }
}
