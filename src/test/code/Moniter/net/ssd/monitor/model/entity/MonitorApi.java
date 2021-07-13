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
@ApiModel(value="MonitorApi对象", description="")
public class MonitorApi implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 应用id
   */
    private String applyId;

  /**
   * 接口名称
   */
    private String interfaceName;

  /**
   * 接口地址
   */
    private String interfaceAddress;

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
   * 应用名称
   */
    private String applyName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress;
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

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    @Override
    public String toString() {
        return "MonitorApi{" +
        "id=" + id +
        ", applyId=" + applyId +
        ", interfaceName=" + interfaceName +
        ", interfaceAddress=" + interfaceAddress +
        ", updateTime=" + updateTime +
        ", sataus=" + sataus +
        ", timestamp=" + timestamp +
        ", applyName=" + applyName +
        "}";
    }
}
