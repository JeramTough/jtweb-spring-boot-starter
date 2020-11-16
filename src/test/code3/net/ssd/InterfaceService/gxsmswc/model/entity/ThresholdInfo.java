package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ThresholdInfo对象", description="")
public class ThresholdInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "代码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "最大值")
    private String maxValue;

    @ApiModelProperty(value = "最小值")
    private String minValue;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "时间")
    private LocalDateTime dataTime;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "0无效，1有效")
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ThresholdInfo{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", maxValue=" + maxValue +
        ", minValue=" + minValue +
        ", description=" + description +
        ", dataTime=" + dataTime +
        ", unit=" + unit +
        ", status=" + status +
        "}";
    }
}
