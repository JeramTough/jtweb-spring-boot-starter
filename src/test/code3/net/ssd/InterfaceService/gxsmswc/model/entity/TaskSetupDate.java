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
@ApiModel(value="TaskSetupDate对象", description="")
public class TaskSetupDate implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "任务ID（task_setup）")
    private Integer taskId;

    @ApiModelProperty(value = "执行日期：月份（01-01）；按日（01）")
    private String sdDate;

    @ApiModelProperty(value = "按周执行：0周日；1周一--6周六")
    private Integer sdWeek;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getSdDate() {
        return sdDate;
    }

    public void setSdDate(String sdDate) {
        this.sdDate = sdDate;
    }

    public Integer getSdWeek() {
        return sdWeek;
    }

    public void setSdWeek(Integer sdWeek) {
        this.sdWeek = sdWeek;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TaskSetupDate{" +
        "taskId=" + taskId +
        ", sdDate=" + sdDate +
        ", sdWeek=" + sdWeek +
        ", id=" + id +
        "}";
    }
}
