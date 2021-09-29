package com.jeramtough.im.model.entity;

import java.math.BigDecimal;
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
 * @author WeiBoWen
 * @since 2021-09-23
 */
@ApiModel(value="ImStudentScore对象", description="")
public class ImStudentScoreDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "英语成绩")
    private BigDecimal scoresEnglish;

    @ApiModelProperty(value = "数学成绩")
    private BigDecimal scoresMath;

    @ApiModelProperty(value = "艺术成绩")
    private BigDecimal scoresArt;

    @ApiModelProperty(value = "综合成绩")
    private BigDecimal scoresComprehensive;

    @ApiModelProperty(value = "语文成绩")
    private BigDecimal scoresChinese;

    @ApiModelProperty(value = "学期")
    private String semester;

    @ApiModelProperty(value = "学生id")
    private Long studentId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public BigDecimal getScoresEnglish() {
        return scoresEnglish;
    }

    public void setScoresEnglish(BigDecimal scoresEnglish) {
        this.scoresEnglish = scoresEnglish;
    }

    public BigDecimal getScoresMath() {
        return scoresMath;
    }

    public void setScoresMath(BigDecimal scoresMath) {
        this.scoresMath = scoresMath;
    }

    public BigDecimal getScoresArt() {
        return scoresArt;
    }

    public void setScoresArt(BigDecimal scoresArt) {
        this.scoresArt = scoresArt;
    }

    public BigDecimal getScoresComprehensive() {
        return scoresComprehensive;
    }

    public void setScoresComprehensive(BigDecimal scoresComprehensive) {
        this.scoresComprehensive = scoresComprehensive;
    }

    public BigDecimal getScoresChinese() {
        return scoresChinese;
    }

    public void setScoresChinese(BigDecimal scoresChinese) {
        this.scoresChinese = scoresChinese;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ImStudentScore{" +
        "fid=" + fid +
        ", scoresEnglish=" + scoresEnglish +
        ", scoresMath=" + scoresMath +
        ", scoresArt=" + scoresArt +
        ", scoresComprehensive=" + scoresComprehensive +
        ", scoresChinese=" + scoresChinese +
        ", semester=" + semester +
        ", studentId=" + studentId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
