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
@ApiModel(value="BasinRainAvg对象", description="")
public class BasinRainAvgDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "流域名称")
    private String areaName;

    @ApiModelProperty(value = "时间类型：年year；季quarter；月month；旬decad")
    private String dateType;

    @ApiModelProperty(value = "时间值")
    private String dateValue;

    @ApiModelProperty(value = "降水平均值")
    private String rainAvg;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getRainAvg() {
        return rainAvg;
    }

    public void setRainAvg(String rainAvg) {
        this.rainAvg = rainAvg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BasinRainAvg{" +
        "areaName=" + areaName +
        ", dateType=" + dateType +
        ", dateValue=" + dateValue +
        ", rainAvg=" + rainAvg +
        ", id=" + id +
        "}";
    }
}
