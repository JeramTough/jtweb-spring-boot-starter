package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="AlertWebDefence对象", description="")
public class AlertWebDefenceDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("Id")
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
