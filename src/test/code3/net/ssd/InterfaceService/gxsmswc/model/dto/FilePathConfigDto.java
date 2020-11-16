package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文件路径配置
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="FilePathConfig对象", description="文件路径配置")
public class FilePathConfigDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "资料文件名称")
    private String fileName;

    @ApiModelProperty(value = "资料文件路径")
    private String filePath;

    @ApiModelProperty(value = "数据时间")
    private LocalDateTime dataTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    @Override
    public String toString() {
        return "FilePathConfig{" +
        "id=" + id +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", dataTime=" + dataTime +
        "}";
    }
}
