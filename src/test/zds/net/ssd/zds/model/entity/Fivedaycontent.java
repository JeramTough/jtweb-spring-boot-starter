package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("FiveDayContent")
@ApiModel(value="Fivedaycontent对象", description="")
public class Fivedaycontent implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String ldate;

    private String time;

    private String content;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Fivedaycontent{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", time=" + time +
        ", content=" + content +
        "}";
    }
}
