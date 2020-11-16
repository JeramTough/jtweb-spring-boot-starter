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
@ApiModel(value="RailLine对象", description="")
public class RailLineDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "线路代码")
    private String lineCode;

    @ApiModelProperty(value = "线路名称")
    private String lineName;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RailLine{" +
        "lineCode=" + lineCode +
        ", lineName=" + lineName +
        ", id=" + id +
        "}";
    }
}
