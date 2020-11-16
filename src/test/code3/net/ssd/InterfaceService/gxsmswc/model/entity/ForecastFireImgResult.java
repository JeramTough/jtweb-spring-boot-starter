package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ForecastFireImgResult对象", description="")
public class ForecastFireImgResult implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片日期")
    private String imgDate;

    @ApiModelProperty(value = "图片时次：08；20")
    private String imgTimes;

    @ApiModelProperty(value = "预报时效：24；48")
    private String forecastTimes;

    @ApiModelProperty(value = "图片路径")
    private String imgListData;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String mark;


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

    public String getForecastTimes() {
        return forecastTimes;
    }

    public void setForecastTimes(String forecastTimes) {
        this.forecastTimes = forecastTimes;
    }

    public String getImgListData() {
        return imgListData;
    }

    public void setImgListData(String imgListData) {
        this.imgListData = imgListData;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ForecastFireImgResult{" +
        "imgDate=" + imgDate +
        ", imgTimes=" + imgTimes +
        ", forecastTimes=" + forecastTimes +
        ", imgListData=" + imgListData +
        ", createTime=" + createTime +
        ", id=" + id +
        ", mark=" + mark +
        "}";
    }
}
