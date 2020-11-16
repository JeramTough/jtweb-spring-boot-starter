package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("Ssd_HightWay_Station_new")
@ApiModel(value="SsdHightwayStationNew对象", description="")
public class SsdHightwayStationNewDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("MLON")
    private String mlon;

    @TableField("LXBH")
    private String lxbh;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("COUN")
    private String coun;

    @TableField("RAID")
    private String raid;

    @TableField("PROV")
    private String prov;

    @TableField("TOWN")
    private String town;

    @TableField("MLAT")
    private String mlat;

    @TableField("CITY")
    private String city;

    @TableField("TOID")
    private String toid;

    @TableField("LXJC")
    private String lxjc;


    public String getMlon() {
        return mlon;
    }

    public void setMlon(String mlon) {
        this.mlon = mlon;
    }

    public String getLxbh() {
        return lxbh;
    }

    public void setLxbh(String lxbh) {
        this.lxbh = lxbh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoun() {
        return coun;
    }

    public void setCoun(String coun) {
        this.coun = coun;
    }

    public String getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getMlat() {
        return mlat;
    }

    public void setMlat(String mlat) {
        this.mlat = mlat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getLxjc() {
        return lxjc;
    }

    public void setLxjc(String lxjc) {
        this.lxjc = lxjc;
    }

    @Override
    public String toString() {
        return "SsdHightwayStationNew{" +
        "mlon=" + mlon +
        ", lxbh=" + lxbh +
        ", id=" + id +
        ", coun=" + coun +
        ", raid=" + raid +
        ", prov=" + prov +
        ", town=" + town +
        ", mlat=" + mlat +
        ", city=" + city +
        ", toid=" + toid +
        ", lxjc=" + lxjc +
        "}";
    }
}
