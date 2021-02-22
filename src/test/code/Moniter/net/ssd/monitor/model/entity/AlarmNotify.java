package net.ssd.monitor.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 告警联系人 告警规则 关联表
 * </p>
 *
 * @author WeiBoWen
 * @since 2020-12-23
 */
@ApiModel(value="AlarmNotify对象", description="告警联系人 告警规则 关联表")
public class AlarmNotify implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

  /**
   * 所属告警规则ID
   */
    private Integer alarmRuleId;

  /**
   * 联系人ID
   */
    private Integer alarmContactsId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Integer alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public Integer getAlarmContactsId() {
        return alarmContactsId;
    }

    public void setAlarmContactsId(Integer alarmContactsId) {
        this.alarmContactsId = alarmContactsId;
    }

    @Override
    public String toString() {
        return "AlarmNotify{" +
        "id=" + id +
        ", alarmRuleId=" + alarmRuleId +
        ", alarmContactsId=" + alarmContactsId +
        "}";
    }
}
