package net.ssd.monitor.model.entity;

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
 * @author WeiBoWen
 * @since 2021-04-27
 */
@ApiModel(value="AlarmContacts对象", description="")
public class AlarmContactsDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "通知名称")
    private String name;

    @ApiModelProperty(value = "目标 可以是钉钉连接 、一般HTTP URL 、 邮箱、手机号等等")
    private String target;

    @ApiModelProperty(value = "扩展参数，根据需要存放扩展参数，如钉钉的access_token ")
    private String extParams;

    @ApiModelProperty(value = "通知类型 1,钉钉群 2，短信 3，邮箱 4, getUrl")
    private Integer type;


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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getExtParams() {
        return extParams;
    }

    public void setExtParams(String extParams) {
        this.extParams = extParams;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AlarmContacts{" +
        "id=" + id +
        ", name=" + name +
        ", target=" + target +
        ", extParams=" + extParams +
        ", type=" + type +
        "}";
    }
}
