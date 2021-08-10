package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-04-25
 */
@ApiModel(value="AlertWebDefence对象", description="")
public class AlertWebDefence implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("Id")
    private String id;

    @TableField("Signaltype")
    private String signaltype;

    @TableField("Signallevel")
    private String signallevel;

    @TableField("Defence")
    private String defence;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSignaltype() {
        return signaltype;
    }

    public void setSignaltype(String signaltype) {
        this.signaltype = signaltype;
    }

    public String getSignallevel() {
        return signallevel;
    }

    public void setSignallevel(String signallevel) {
        this.signallevel = signallevel;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "AlertWebDefence{" +
        "id=" + id +
        ", signaltype=" + signaltype +
        ", signallevel=" + signallevel +
        ", defence=" + defence +
        "}";
    }
}
