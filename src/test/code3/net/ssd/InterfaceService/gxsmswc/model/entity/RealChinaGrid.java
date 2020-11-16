package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="RealChinaGrid对象", description="")
public class RealChinaGrid implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "要素")
    private String element;

    @ApiModelProperty(value = "数据时间")
    private String dataTime;

    @ApiModelProperty(value = "图片路径")
    private String imagePath;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "入库时间")
    private LocalDateTime insertTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "RealChinaGrid{" +
        "id=" + id +
        ", element=" + element +
        ", dataTime=" + dataTime +
        ", imagePath=" + imagePath +
        ", filePath=" + filePath +
        ", insertTime=" + insertTime +
        "}";
    }
}
