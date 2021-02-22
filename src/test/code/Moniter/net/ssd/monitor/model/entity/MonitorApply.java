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
 * @since 2020-12-23
 */
@ApiModel(value="MonitorApply对象", description="")
public class MonitorApply implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 服务器ip
   */
    private String serverIp;

  /**
   * 应用标识
   */
    private String applyId;

  /**
   * 应用名称
   */
    private String applyName;

  /**
   * 端口号
   */
    private String port;

  /**
   * 状态，1正常，0异常
   */
    private String status;

  /**
   * 更新时间
   */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "MonitorApply{" +
        "id=" + id +
        ", serverIp=" + serverIp +
        ", applyId=" + applyId +
        ", applyName=" + applyName +
        ", port=" + port +
        ", status=" + status +
        ", updateTime=" + updateTime +
        "}";
    }
}
