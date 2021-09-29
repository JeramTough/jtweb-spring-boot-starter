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
@ApiModel(value="SymNode对象", description="")
public class SymNode implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String nodeGroupId;

    private String externalId;

    private Integer syncEnabled;

    private String syncUrl;

    private String schemaVersion;

    private String symmetricVersion;

    private String configVersion;

    private String databaseType;

    private String databaseVersion;

    private String databaseName;

    private Integer batchToSendCount;

    private Integer batchInErrorCount;

    private String createdAtNodeId;

    private String deploymentType;

    private String deploymentSubType;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Integer getSyncEnabled() {
        return syncEnabled;
    }

    public void setSyncEnabled(Integer syncEnabled) {
        this.syncEnabled = syncEnabled;
    }

    public String getSyncUrl() {
        return syncUrl;
    }

    public void setSyncUrl(String syncUrl) {
        this.syncUrl = syncUrl;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getSymmetricVersion() {
        return symmetricVersion;
    }

    public void setSymmetricVersion(String symmetricVersion) {
        this.symmetricVersion = symmetricVersion;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Integer getBatchToSendCount() {
        return batchToSendCount;
    }

    public void setBatchToSendCount(Integer batchToSendCount) {
        this.batchToSendCount = batchToSendCount;
    }

    public Integer getBatchInErrorCount() {
        return batchInErrorCount;
    }

    public void setBatchInErrorCount(Integer batchInErrorCount) {
        this.batchInErrorCount = batchInErrorCount;
    }

    public String getCreatedAtNodeId() {
        return createdAtNodeId;
    }

    public void setCreatedAtNodeId(String createdAtNodeId) {
        this.createdAtNodeId = createdAtNodeId;
    }

    public String getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public String getDeploymentSubType() {
        return deploymentSubType;
    }

    public void setDeploymentSubType(String deploymentSubType) {
        this.deploymentSubType = deploymentSubType;
    }

    @Override
    public String toString() {
        return "SymNode{" +
        "nodeId=" + nodeId +
        ", nodeGroupId=" + nodeGroupId +
        ", externalId=" + externalId +
        ", syncEnabled=" + syncEnabled +
        ", syncUrl=" + syncUrl +
        ", schemaVersion=" + schemaVersion +
        ", symmetricVersion=" + symmetricVersion +
        ", configVersion=" + configVersion +
        ", databaseType=" + databaseType +
        ", databaseVersion=" + databaseVersion +
        ", databaseName=" + databaseName +
        ", batchToSendCount=" + batchToSendCount +
        ", batchInErrorCount=" + batchInErrorCount +
        ", createdAtNodeId=" + createdAtNodeId +
        ", deploymentType=" + deploymentType +
        ", deploymentSubType=" + deploymentSubType +
        "}";
    }
}
