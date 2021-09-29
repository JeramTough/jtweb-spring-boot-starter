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
@ApiModel(value="SymChannel对象", description="")
public class SymChannel implements Serializable {

    private static final long serialVersionUID=1L;

    private String channelId;

    private Integer processingOrder;

    private Integer maxBatchSize;

    private Integer maxBatchToSend;

    private Integer maxDataToRoute;

    private Integer extractPeriodMillis;

    private Integer enabled;

    private Integer useOldDataToRoute;

    private Integer useRowDataToRoute;

    private Integer usePkDataToRoute;

    private Integer reloadFlag;

    private Integer fileSyncFlag;

    private Integer containsBigLob;

    private String batchAlgorithm;

    private String dataLoaderType;

    private String description;

    private String queue;

    private Double maxNetworkKbps;

    private String dataEventAction;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getProcessingOrder() {
        return processingOrder;
    }

    public void setProcessingOrder(Integer processingOrder) {
        this.processingOrder = processingOrder;
    }

    public Integer getMaxBatchSize() {
        return maxBatchSize;
    }

    public void setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public Integer getMaxBatchToSend() {
        return maxBatchToSend;
    }

    public void setMaxBatchToSend(Integer maxBatchToSend) {
        this.maxBatchToSend = maxBatchToSend;
    }

    public Integer getMaxDataToRoute() {
        return maxDataToRoute;
    }

    public void setMaxDataToRoute(Integer maxDataToRoute) {
        this.maxDataToRoute = maxDataToRoute;
    }

    public Integer getExtractPeriodMillis() {
        return extractPeriodMillis;
    }

    public void setExtractPeriodMillis(Integer extractPeriodMillis) {
        this.extractPeriodMillis = extractPeriodMillis;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getUseOldDataToRoute() {
        return useOldDataToRoute;
    }

    public void setUseOldDataToRoute(Integer useOldDataToRoute) {
        this.useOldDataToRoute = useOldDataToRoute;
    }

    public Integer getUseRowDataToRoute() {
        return useRowDataToRoute;
    }

    public void setUseRowDataToRoute(Integer useRowDataToRoute) {
        this.useRowDataToRoute = useRowDataToRoute;
    }

    public Integer getUsePkDataToRoute() {
        return usePkDataToRoute;
    }

    public void setUsePkDataToRoute(Integer usePkDataToRoute) {
        this.usePkDataToRoute = usePkDataToRoute;
    }

    public Integer getReloadFlag() {
        return reloadFlag;
    }

    public void setReloadFlag(Integer reloadFlag) {
        this.reloadFlag = reloadFlag;
    }

    public Integer getFileSyncFlag() {
        return fileSyncFlag;
    }

    public void setFileSyncFlag(Integer fileSyncFlag) {
        this.fileSyncFlag = fileSyncFlag;
    }

    public Integer getContainsBigLob() {
        return containsBigLob;
    }

    public void setContainsBigLob(Integer containsBigLob) {
        this.containsBigLob = containsBigLob;
    }

    public String getBatchAlgorithm() {
        return batchAlgorithm;
    }

    public void setBatchAlgorithm(String batchAlgorithm) {
        this.batchAlgorithm = batchAlgorithm;
    }

    public String getDataLoaderType() {
        return dataLoaderType;
    }

    public void setDataLoaderType(String dataLoaderType) {
        this.dataLoaderType = dataLoaderType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public Double getMaxNetworkKbps() {
        return maxNetworkKbps;
    }

    public void setMaxNetworkKbps(Double maxNetworkKbps) {
        this.maxNetworkKbps = maxNetworkKbps;
    }

    public String getDataEventAction() {
        return dataEventAction;
    }

    public void setDataEventAction(String dataEventAction) {
        this.dataEventAction = dataEventAction;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "SymChannel{" +
        "channelId=" + channelId +
        ", processingOrder=" + processingOrder +
        ", maxBatchSize=" + maxBatchSize +
        ", maxBatchToSend=" + maxBatchToSend +
        ", maxDataToRoute=" + maxDataToRoute +
        ", extractPeriodMillis=" + extractPeriodMillis +
        ", enabled=" + enabled +
        ", useOldDataToRoute=" + useOldDataToRoute +
        ", useRowDataToRoute=" + useRowDataToRoute +
        ", usePkDataToRoute=" + usePkDataToRoute +
        ", reloadFlag=" + reloadFlag +
        ", fileSyncFlag=" + fileSyncFlag +
        ", containsBigLob=" + containsBigLob +
        ", batchAlgorithm=" + batchAlgorithm +
        ", dataLoaderType=" + dataLoaderType +
        ", description=" + description +
        ", queue=" + queue +
        ", maxNetworkKbps=" + maxNetworkKbps +
        ", dataEventAction=" + dataEventAction +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}
