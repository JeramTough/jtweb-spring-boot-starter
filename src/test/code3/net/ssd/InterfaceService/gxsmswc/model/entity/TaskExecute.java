package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@ApiModel(value="TaskExecute对象", description="")
public class TaskExecute implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "任务ID（task_setup）")
    private Integer taskId;

    @ApiModelProperty(value = "任务执行的时间")
    private LocalDateTime exeTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public LocalDateTime getExeTime() {
        return exeTime;
    }

    public void setExeTime(LocalDateTime exeTime) {
        this.exeTime = exeTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TaskExecute{" +
        "taskId=" + taskId +
        ", exeTime=" + exeTime +
        ", id=" + id +
        "}";
    }
}
