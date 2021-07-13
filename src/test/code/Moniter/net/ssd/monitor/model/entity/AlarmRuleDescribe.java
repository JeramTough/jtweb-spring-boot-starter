package net.ssd.monitor.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 规则描述表 定义了该规则的行为
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-04-27
 */
@ApiModel(value="AlarmRuleDescribe对象", description="规则描述表 定义了该规则的行为")
public class AlarmRuleDescribe implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

  /**
   * 规则描述
   */
    private String ruleDescribe;

  /**
   * 周期（毫秒）	如CPU 使用率大于90%  20秒则设置 20000
   */
    private Integer cycle;

  /**
   * 所属的告警规则id，这张表不符合三范式规则我也没办法
   */
    private Integer alarmRuleId;

  /**
   * 规则描述id	100. 宕机/离线	101. CPU使用率	102. 内存使用率	103. 硬盘使用率	104. 网络速率	200. API请求异常	300. 应用程序状态异常	400. 数据推送异常	500. 采集解析异常	700. 流域监控降水量
   */
    private Integer describeId;

  /**
   * 阈值
   */
    private Float threshold;

  /**
   * 0等于，1大于，2小于，3大于等于，4小于等于
   */
    private Integer contrastRuleId;

  /**
   * 如  CPU占用单位  （%）    带宽单位  （Mbits/s） 磁盘占用单位 （%）   错误次数 （次）
   */
    private String unit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleDescribe() {
        return ruleDescribe;
    }

    public void setRuleDescribe(String ruleDescribe) {
        this.ruleDescribe = ruleDescribe;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Integer getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Integer alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }

    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    public Integer getContrastRuleId() {
        return contrastRuleId;
    }

    public void setContrastRuleId(Integer contrastRuleId) {
        this.contrastRuleId = contrastRuleId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "AlarmRuleDescribe{" +
        "id=" + id +
        ", ruleDescribe=" + ruleDescribe +
        ", cycle=" + cycle +
        ", alarmRuleId=" + alarmRuleId +
        ", describeId=" + describeId +
        ", threshold=" + threshold +
        ", contrastRuleId=" + contrastRuleId +
        ", unit=" + unit +
        "}";
    }
}
