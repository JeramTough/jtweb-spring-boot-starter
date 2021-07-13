package net.ssd.monitor.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 告警规则表 ， 定义该规则信息
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-04-27
 */
@ApiModel(value="AlarmRule对象", description="告警规则表 ， 定义该规则信息")
public class AlarmRuleDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "规则名")
    private String name;

    @ApiModelProperty(value = "类别 1硬件监控,2api监控告警，3应用程序监控告警，4数据推送监控告警，5采集解析监控告警,6数据源监控告警 ")
    private Integer type;

    @ApiModelProperty(value = "报警回调URL地址，发生告警时，讲请求该URL（如果填写），	填写公网可访问的URL，云监控会将报警信息通过POST请求推送到该地址")
    private String alarmCallbackUrl;

    @ApiModelProperty(value = "通知最小间隔，防止重复通知，如果大于该值还未恢复再通知。")
    private Integer alarmInterval;

    @ApiModelProperty(value = "是否启用 1启用 0禁用")
    private Integer enable;

    @ApiModelProperty(value = "告警通知生效起始时间")
    private String alarmNotifyStarttime;

    @ApiModelProperty(value = "告警通知生效结束时间")
    private String alarmNotifyEndtime;

    @ApiModelProperty(value = "服务器id列表，逗号隔开")
    private String serverIds;

    @ApiModelProperty(value = "通知渠道id列表，逗号隔开")
    private String constactsIds;

    @ApiModelProperty(value = "自定义拓展信息")
    private String customInfo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAlarmCallbackUrl() {
        return alarmCallbackUrl;
    }

    public void setAlarmCallbackUrl(String alarmCallbackUrl) {
        this.alarmCallbackUrl = alarmCallbackUrl;
    }

    public Integer getAlarmInterval() {
        return alarmInterval;
    }

    public void setAlarmInterval(Integer alarmInterval) {
        this.alarmInterval = alarmInterval;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getAlarmNotifyStarttime() {
        return alarmNotifyStarttime;
    }

    public void setAlarmNotifyStarttime(String alarmNotifyStarttime) {
        this.alarmNotifyStarttime = alarmNotifyStarttime;
    }

    public String getAlarmNotifyEndtime() {
        return alarmNotifyEndtime;
    }

    public void setAlarmNotifyEndtime(String alarmNotifyEndtime) {
        this.alarmNotifyEndtime = alarmNotifyEndtime;
    }

    public String getServerIds() {
        return serverIds;
    }

    public void setServerIds(String serverIds) {
        this.serverIds = serverIds;
    }

    public String getConstactsIds() {
        return constactsIds;
    }

    public void setConstactsIds(String constactsIds) {
        this.constactsIds = constactsIds;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    @Override
    public String toString() {
        return "AlarmRule{" +
        "id=" + id +
        ", name=" + name +
        ", type=" + type +
        ", alarmCallbackUrl=" + alarmCallbackUrl +
        ", alarmInterval=" + alarmInterval +
        ", enable=" + enable +
        ", alarmNotifyStarttime=" + alarmNotifyStarttime +
        ", alarmNotifyEndtime=" + alarmNotifyEndtime +
        ", serverIds=" + serverIds +
        ", constactsIds=" + constactsIds +
        ", customInfo=" + customInfo +
        "}";
    }
}
