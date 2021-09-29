package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="SymData对象", description="")
public class SymData implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "data_id", type = IdType.AUTO)
    private Long dataId;

    private String tableName;

    private String eventType;

    private String rowData;

    private String pkData;

    private String oldData;

    private Integer triggerHistId;

    private String channelId;

    private String transactionId;

    private String sourceNodeId;

    private String externalData;

    private String nodeList;

    private Integer isPrerouted;

    private LocalDateTime createTime;


    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getRowData() {
        return rowData;
    }

    public void setRowData(String rowData) {
        this.rowData = rowData;
    }

    public String getPkData() {
        return pkData;
    }

    public void setPkData(String pkData) {
        this.pkData = pkData;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public Integer getTriggerHistId() {
        return triggerHistId;
    }

    public void setTriggerHistId(Integer triggerHistId) {
        this.triggerHistId = triggerHistId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public String getExternalData() {
        return externalData;
    }

    public void setExternalData(String externalData) {
        this.externalData = externalData;
    }

    public String getNodeList() {
        return nodeList;
    }

    public void setNodeList(String nodeList) {
        this.nodeList = nodeList;
    }

    public Integer getIsPrerouted() {
        return isPrerouted;
    }

    public void setIsPrerouted(Integer isPrerouted) {
        this.isPrerouted = isPrerouted;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SymData{" +
        "dataId=" + dataId +
        ", tableName=" + tableName +
        ", eventType=" + eventType +
        ", rowData=" + rowData +
        ", pkData=" + pkData +
        ", oldData=" + oldData +
        ", triggerHistId=" + triggerHistId +
        ", channelId=" + channelId +
        ", transactionId=" + transactionId +
        ", sourceNodeId=" + sourceNodeId +
        ", externalData=" + externalData +
        ", nodeList=" + nodeList +
        ", isPrerouted=" + isPrerouted +
        ", createTime=" + createTime +
        "}";
    }
}
