package net.ssd.monitor.model.entity;

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
 * @since 2021-04-27
 */
@ApiModel(value="MonitorException对象", description="")
public class MonitorException implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 名称
   */
    private String name;

  /**
   * 0 api监控，1数据推送，2数据采集解析
   */
    private Integer dataType;

  /**
   * 接口地址
   */
    private String interfaceAddress;

  /**
   * 请求类型
   */
    private String monitorType;

  /**
   * 最后更新时间
   */
    private LocalDateTime updateTime;

  /**
   * 状态
   */
    private String sataus;

  /**
   * 响应时间
   */
    private String timestamp;

  /**
   * 任务标识
   */
    private String taskFlay;

  /**
   * 数据标识
   */
    private String dataFlay;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getSataus() {
        return sataus;
    }

    public void setSataus(String sataus) {
        this.sataus = sataus;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTaskFlay() {
        return taskFlay;
    }

    public void setTaskFlay(String taskFlay) {
        this.taskFlay = taskFlay;
    }

    public String getDataFlay() {
        return dataFlay;
    }

    public void setDataFlay(String dataFlay) {
        this.dataFlay = dataFlay;
    }

    @Override
    public String toString() {
        return "MonitorException{" +
        "id=" + id +
        ", name=" + name +
        ", dataType=" + dataType +
        ", interfaceAddress=" + interfaceAddress +
        ", monitorType=" + monitorType +
        ", updateTime=" + updateTime +
        ", sataus=" + sataus +
        ", timestamp=" + timestamp +
        ", taskFlay=" + taskFlay +
        ", dataFlay=" + dataFlay +
        "}";
    }
}
