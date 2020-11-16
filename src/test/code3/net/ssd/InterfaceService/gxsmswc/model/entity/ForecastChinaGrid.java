package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 中国智能网格预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ForecastChinaGrid对象", description="中国智能网格预报")
public class ForecastChinaGrid implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "要素")
    private String element;

    @ApiModelProperty(value = "起报时间")
    private String forecastTime;

    @ApiModelProperty(value = "时间间隔")
    private String times;

    @ApiModelProperty(value = "入库时间")
    private LocalDateTime saveTime;

    @ApiModelProperty(value = "图片路径")
    private String imagePath;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "时间等级")
    private String timeLevel;


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

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
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

    public String getTimeLevel() {
        return timeLevel;
    }

    public void setTimeLevel(String timeLevel) {
        this.timeLevel = timeLevel;
    }

    @Override
    public String toString() {
        return "ForecastChinaGrid{" +
        "id=" + id +
        ", element=" + element +
        ", forecastTime=" + forecastTime +
        ", times=" + times +
        ", saveTime=" + saveTime +
        ", imagePath=" + imagePath +
        ", filePath=" + filePath +
        ", timeLevel=" + timeLevel +
        "}";
    }
}
