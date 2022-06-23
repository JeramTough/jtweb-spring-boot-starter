package com.jeramtough.im.model.entity;

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
 * @since 2021-10-22
 */
@ApiModel(value="ImTeacherClockingIn对象", description="")
public class ImTeacherClockingInDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "用户id")
    private Long uid;

    @ApiModelProperty(value = "位置")
    private String location;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "打卡时间")
    private LocalDateTime time;

    @ApiModelProperty(value = "定位类型")
    private String type;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ImTeacherClockingIn{" +
        "fid=" + fid +
        ", lat=" + lat +
        ", lon=" + lon +
        ", uid=" + uid +
        ", location=" + location +
        ", name=" + name +
        ", time=" + time +
        ", type=" + type +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
