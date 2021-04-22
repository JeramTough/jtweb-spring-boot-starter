package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("Flux_Station")
@ApiModel(value="FluxStation对象", description="")
public class FluxStationDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("stationNum")
    private String stationnum;

    @TableField("spellName")
    private String spellname;

    @TableField("chineseName")
    private String chinesename;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationnum() {
        return stationnum;
    }

    public void setStationnum(String stationnum) {
        this.stationnum = stationnum;
    }

    public String getSpellname() {
        return spellname;
    }

    public void setSpellname(String spellname) {
        this.spellname = spellname;
    }

    public String getChinesename() {
        return chinesename;
    }

    public void setChinesename(String chinesename) {
        this.chinesename = chinesename;
    }

    @Override
    public String toString() {
        return "FluxStation{" +
        "id=" + id +
        ", stationnum=" + stationnum +
        ", spellname=" + spellname +
        ", chinesename=" + chinesename +
        "}";
    }
}
