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
@ApiModel(value="TaskSchedulingDate对象", description="")
public class TaskSchedulingDate implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "外键ID（task_scheduling表的id）")
    private Integer tsId;

    @ApiModelProperty(value = "日：(01,02.....31)；月(01-01,01-02........12-31)；周(0,1,2,3,4,5,6)")
    private String tsDate;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public Integer getTsId() {
        return tsId;
    }

    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    public String getTsDate() {
        return tsDate;
    }

    public void setTsDate(String tsDate) {
        this.tsDate = tsDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TaskSchedulingDate{" +
        "tsId=" + tsId +
        ", tsDate=" + tsDate +
        ", id=" + id +
        "}";
    }
}
