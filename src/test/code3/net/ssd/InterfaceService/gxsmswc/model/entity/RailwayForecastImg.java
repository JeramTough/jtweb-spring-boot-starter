package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@ApiModel(value="RailwayForecastImg对象", description="")
public class RailwayForecastImg implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片名称")
    private String imgName;

    @ApiModelProperty(value = "格点资料类型")
    private String gridType;

    @ApiModelProperty(value = "气象要素类型")
    private String weatherType;

    @ApiModelProperty(value = "图片日期")
    private String imgDate;

    @ApiModelProperty(value = "图片时次：08；20")
    private String imgTimes;

    @ApiModelProperty(value = "预报时效：24；48")
    private String foreTimes;

    @ApiModelProperty(value = "图片路径")
    private String imgPath;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否发布，默认为0，发布后为1")
    @TableField("isPublish")
    private Integer isPublish;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getGridType() {
        return gridType;
    }

    public void setGridType(String gridType) {
        this.gridType = gridType;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getImgDate() {
        return imgDate;
    }

    public void setImgDate(String imgDate) {
        this.imgDate = imgDate;
    }

    public String getImgTimes() {
        return imgTimes;
    }

    public void setImgTimes(String imgTimes) {
        this.imgTimes = imgTimes;
    }

    public String getForeTimes() {
        return foreTimes;
    }

    public void setForeTimes(String foreTimes) {
        this.foreTimes = foreTimes;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RailwayForecastImg{" +
        "imgName=" + imgName +
        ", gridType=" + gridType +
        ", weatherType=" + weatherType +
        ", imgDate=" + imgDate +
        ", imgTimes=" + imgTimes +
        ", foreTimes=" + foreTimes +
        ", imgPath=" + imgPath +
        ", createTime=" + createTime +
        ", isPublish=" + isPublish +
        ", id=" + id +
        "}";
    }
}
