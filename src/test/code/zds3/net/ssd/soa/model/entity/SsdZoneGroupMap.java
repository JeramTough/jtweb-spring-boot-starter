package net.ssd.soa.model.entity;

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
 * @since 2021-09-14
 */
@ApiModel(value="SsdZoneGroupMap对象", description="")
public class SsdZoneGroupMap implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String zoneCode;

    private String zoneGroupName;

    private String zoneSubNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getZoneGroupName() {
        return zoneGroupName;
    }

    public void setZoneGroupName(String zoneGroupName) {
        this.zoneGroupName = zoneGroupName;
    }

    public String getZoneSubNum() {
        return zoneSubNum;
    }

    public void setZoneSubNum(String zoneSubNum) {
        this.zoneSubNum = zoneSubNum;
    }

    @Override
    public String toString() {
        return "SsdZoneGroupMap{" +
        "id=" + id +
        ", zoneCode=" + zoneCode +
        ", zoneGroupName=" + zoneGroupName +
        ", zoneSubNum=" + zoneSubNum +
        "}";
    }
}
