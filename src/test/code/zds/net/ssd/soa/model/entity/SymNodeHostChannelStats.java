package net.ssd.soa.model.entity;

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
@ApiModel(value="SymNodeHostChannelStats对象", description="")
public class SymNodeHostChannelStats implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String hostName;

    private String channelId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long dataRouted;

    private Long dataUnrouted;

    private Long dataEventInserted;

    private Long dataExtracted;

    private Long dataBytesExtracted;

    private Long dataExtractedErrors;

    private Long dataBytesSent;

    private Long dataSent;

    private Long dataSentErrors;

    private Long dataLoaded;

    private Long dataBytesLoaded;

    private Long dataLoadedErrors;

    private Long dataLoadedOutgoing;

    private Long dataBytesLoadedOutgoing;

    private Long dataLoadedOutgoingErrors;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Long getDataRouted() {
        return dataRouted;
    }

    public void setDataRouted(Long dataRouted) {
        this.dataRouted = dataRouted;
    }

    public Long getDataUnrouted() {
        return dataUnrouted;
    }

    public void setDataUnrouted(Long dataUnrouted) {
        this.dataUnrouted = dataUnrouted;
    }

    public Long getDataEventInserted() {
        return dataEventInserted;
    }

    public void setDataEventInserted(Long dataEventInserted) {
        this.dataEventInserted = dataEventInserted;
    }

    public Long getDataExtracted() {
        return dataExtracted;
    }

    public void setDataExtracted(Long dataExtracted) {
        this.dataExtracted = dataExtracted;
    }

    public Long getDataBytesExtracted() {
        return dataBytesExtracted;
    }

    public void setDataBytesExtracted(Long dataBytesExtracted) {
        this.dataBytesExtracted = dataBytesExtracted;
    }

    public Long getDataExtractedErrors() {
        return dataExtractedErrors;
    }

    public void setDataExtractedErrors(Long dataExtractedErrors) {
        this.dataExtractedErrors = dataExtractedErrors;
    }

    public Long getDataBytesSent() {
        return dataBytesSent;
    }

    public void setDataBytesSent(Long dataBytesSent) {
        this.dataBytesSent = dataBytesSent;
    }

    public Long getDataSent() {
        return dataSent;
    }

    public void setDataSent(Long dataSent) {
        this.dataSent = dataSent;
    }

    public Long getDataSentErrors() {
        return dataSentErrors;
    }

    public void setDataSentErrors(Long dataSentErrors) {
        this.dataSentErrors = dataSentErrors;
    }

    public Long getDataLoaded() {
        return dataLoaded;
    }

    public void setDataLoaded(Long dataLoaded) {
        this.dataLoaded = dataLoaded;
    }

    public Long getDataBytesLoaded() {
        return dataBytesLoaded;
    }

    public void setDataBytesLoaded(Long dataBytesLoaded) {
        this.dataBytesLoaded = dataBytesLoaded;
    }

    public Long getDataLoadedErrors() {
        return dataLoadedErrors;
    }

    public void setDataLoadedErrors(Long dataLoadedErrors) {
        this.dataLoadedErrors = dataLoadedErrors;
    }

    public Long getDataLoadedOutgoing() {
        return dataLoadedOutgoing;
    }

    public void setDataLoadedOutgoing(Long dataLoadedOutgoing) {
        this.dataLoadedOutgoing = dataLoadedOutgoing;
    }

    public Long getDataBytesLoadedOutgoing() {
        return dataBytesLoadedOutgoing;
    }

    public void setDataBytesLoadedOutgoing(Long dataBytesLoadedOutgoing) {
        this.dataBytesLoadedOutgoing = dataBytesLoadedOutgoing;
    }

    public Long getDataLoadedOutgoingErrors() {
        return dataLoadedOutgoingErrors;
    }

    public void setDataLoadedOutgoingErrors(Long dataLoadedOutgoingErrors) {
        this.dataLoadedOutgoingErrors = dataLoadedOutgoingErrors;
    }

    @Override
    public String toString() {
        return "SymNodeHostChannelStats{" +
        "nodeId=" + nodeId +
        ", hostName=" + hostName +
        ", channelId=" + channelId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", dataRouted=" + dataRouted +
        ", dataUnrouted=" + dataUnrouted +
        ", dataEventInserted=" + dataEventInserted +
        ", dataExtracted=" + dataExtracted +
        ", dataBytesExtracted=" + dataBytesExtracted +
        ", dataExtractedErrors=" + dataExtractedErrors +
        ", dataBytesSent=" + dataBytesSent +
        ", dataSent=" + dataSent +
        ", dataSentErrors=" + dataSentErrors +
        ", dataLoaded=" + dataLoaded +
        ", dataBytesLoaded=" + dataBytesLoaded +
        ", dataLoadedErrors=" + dataLoadedErrors +
        ", dataLoadedOutgoing=" + dataLoadedOutgoing +
        ", dataBytesLoadedOutgoing=" + dataBytesLoadedOutgoing +
        ", dataLoadedOutgoingErrors=" + dataLoadedOutgoingErrors +
        "}";
    }
}
