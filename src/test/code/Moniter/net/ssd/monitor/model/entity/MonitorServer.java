package net.ssd.monitor.model.entity;

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
 * @since 2021-04-27
 */
@ApiModel(value="MonitorServer对象", description="")
public class MonitorServer implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 服务器ip
   */
    private String serverIp;

  /**
   * 服务器名称
   */
    private String serverName;

  /**
   * 服务器类型  windows  linux
   */
    private String os;


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

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "MonitorServer{" +
        "id=" + id +
        ", serverIp=" + serverIp +
        ", serverName=" + serverName +
        ", os=" + os +
        "}";
    }
}
