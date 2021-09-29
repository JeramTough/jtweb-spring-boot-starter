package net.ssd.soa.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-08
 */
@ApiModel(value="SymFileIncoming对象", description="")
public class SymFileIncomingDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String relativeDir;

    private String fileName;

    private String lastEventType;

    private String nodeId;

    private Long fileModifiedTime;


    public String getRelativeDir() {
        return relativeDir;
    }

    public void setRelativeDir(String relativeDir) {
        this.relativeDir = relativeDir;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLastEventType() {
        return lastEventType;
    }

    public void setLastEventType(String lastEventType) {
        this.lastEventType = lastEventType;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Long getFileModifiedTime() {
        return fileModifiedTime;
    }

    public void setFileModifiedTime(Long fileModifiedTime) {
        this.fileModifiedTime = fileModifiedTime;
    }

    @Override
    public String toString() {
        return "SymFileIncoming{" +
        "relativeDir=" + relativeDir +
        ", fileName=" + fileName +
        ", lastEventType=" + lastEventType +
        ", nodeId=" + nodeId +
        ", fileModifiedTime=" + fileModifiedTime +
        "}";
    }
}
