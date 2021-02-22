package net.ssd.BSM.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 文档模版表
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-02-19
 */
@ApiModel(value="DocumentTemplate对象", description="文档模版表")
public class DocumentTemplate implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 创建时间
   */
    private LocalDateTime createTime;

  /**
   * 修改时间
   */
    private LocalDateTime modifyTime;

  /**
   * 标题
   */
    private String title;

  /**
   * 模版相对路径
   */
    private String relativePath;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    @Override
    public String toString() {
        return "DocumentTemplate{" +
        "id=" + id +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", title=" + title +
        ", relativePath=" + relativePath +
        "}";
    }
}
