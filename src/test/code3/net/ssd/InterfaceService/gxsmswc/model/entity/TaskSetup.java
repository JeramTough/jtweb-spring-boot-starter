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
@ApiModel(value="TaskSetup对象", description="")
public class TaskSetup implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "产品类型ID（product_type）")
    private String productTypeId;

    @ApiModelProperty(value = "任务名称")
    private String taskName;

    @ApiModelProperty(value = "制作人")
    private String makeUser;

    @ApiModelProperty(value = "任务规则名称：按日day；按月month；按周week。")
    private String taskRule;

    @ApiModelProperty(value = "提醒执行时间")
    private String taskRemindTime;

    @ApiModelProperty(value = "提醒次数")
    private Integer taskRemindNum;

    @ApiModelProperty(value = "执行间隔时间（分钟）")
    private Integer taskRemindMinute;

    @ApiModelProperty(value = "是否启用：0未启用；1启用")
    private Integer taskUsing;

    @ApiModelProperty(value = "提示内容")
    private String taskContent;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getMakeUser() {
        return makeUser;
    }

    public void setMakeUser(String makeUser) {
        this.makeUser = makeUser;
    }

    public String getTaskRule() {
        return taskRule;
    }

    public void setTaskRule(String taskRule) {
        this.taskRule = taskRule;
    }

    public String getTaskRemindTime() {
        return taskRemindTime;
    }

    public void setTaskRemindTime(String taskRemindTime) {
        this.taskRemindTime = taskRemindTime;
    }

    public Integer getTaskRemindNum() {
        return taskRemindNum;
    }

    public void setTaskRemindNum(Integer taskRemindNum) {
        this.taskRemindNum = taskRemindNum;
    }

    public Integer getTaskRemindMinute() {
        return taskRemindMinute;
    }

    public void setTaskRemindMinute(Integer taskRemindMinute) {
        this.taskRemindMinute = taskRemindMinute;
    }

    public Integer getTaskUsing() {
        return taskUsing;
    }

    public void setTaskUsing(Integer taskUsing) {
        this.taskUsing = taskUsing;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TaskSetup{" +
        "productTypeId=" + productTypeId +
        ", taskName=" + taskName +
        ", makeUser=" + makeUser +
        ", taskRule=" + taskRule +
        ", taskRemindTime=" + taskRemindTime +
        ", taskRemindNum=" + taskRemindNum +
        ", taskRemindMinute=" + taskRemindMinute +
        ", taskUsing=" + taskUsing +
        ", taskContent=" + taskContent +
        ", id=" + id +
        "}";
    }
}
