package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * EC细网格逐12小时预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ForecastEcmwfThin12对象", description="EC细网格逐12小时预报")
public class ForecastEcmwfThin12 implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "要素")
    private String element;

    @ApiModelProperty(value = "起报时间")
    private String forecastTime;

    @ApiModelProperty(value = "时间间隔")
    private String times;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "图片路径")
    private String imagePath;

    @ApiModelProperty(value = "时间等级")
    private String timeLevel;

    @ApiModelProperty(value = "入库保存时间")
    private LocalDateTime saveTime;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTimeLevel() {
        return timeLevel;
    }

    public void setTimeLevel(String timeLevel) {
        this.timeLevel = timeLevel;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ForecastEcmwfThin12{" +
        "element=" + element +
        ", forecastTime=" + forecastTime +
        ", times=" + times +
        ", filePath=" + filePath +
        ", imagePath=" + imagePath +
        ", timeLevel=" + timeLevel +
        ", saveTime=" + saveTime +
        ", id=" + id +
        "}";
    }
}
