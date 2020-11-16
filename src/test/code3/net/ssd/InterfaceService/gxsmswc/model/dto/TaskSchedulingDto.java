package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalTime;
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
@ApiModel(value="TaskScheduling对象", description="")
public class TaskSchedulingDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "班次：0正班；1副班；2夜班；3其它。")
    private Integer dutyType;

    @ApiModelProperty(value = " 日：day；月：month；周：week")
    private String tsRule;

    @ApiModelProperty(value = "截取时间：HH:mm")
    private LocalTime endTime;

    @ApiModelProperty(value = "启用状态：0未启用；1已启用。")
    private Integer isUsing;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer productTypeId;


    public Integer getDutyType() {
        return dutyType;
    }

    public void setDutyType(Integer dutyType) {
        this.dutyType = dutyType;
    }

    public String getTsRule() {
        return tsRule;
    }

    public void setTsRule(String tsRule) {
        this.tsRule = tsRule;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(Integer isUsing) {
        this.isUsing = isUsing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public String toString() {
        return "TaskScheduling{" +
        "dutyType=" + dutyType +
        ", tsRule=" + tsRule +
        ", endTime=" + endTime +
        ", isUsing=" + isUsing +
        ", id=" + id +
        ", productTypeId=" + productTypeId +
        "}";
    }
}
