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
 * @since 2021-10-22
 */
@ApiModel(value="ImStudentScore2对象", description="")
public class ImStudentScore2 implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 英语成绩
   */
    private BigDecimal scoresEnglish;

  /**
   * 数学成绩
   */
    private BigDecimal scoresMath;

  /**
   * 艺术成绩
   */
    private BigDecimal scoresArt;

  /**
   * 综合成绩
   */
    private BigDecimal scoresComprehensive;

  /**
   * 语文成绩
   */
    private BigDecimal scoresChinese;

  /**
   * 学期组名
   */
    private String semester;

    private Long operatorUid;

  /**
   * 学生id
   */
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

    public Long getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
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
        return "ImStudentScore2{" +
        "fid=" + fid +
        ", scoresEnglish=" + scoresEnglish +
        ", scoresMath=" + scoresMath +
        ", scoresArt=" + scoresArt +
        ", scoresComprehensive=" + scoresComprehensive +
        ", scoresChinese=" + scoresChinese +
        ", semester=" + semester +
        ", operatorUid=" + operatorUid +
        ", studentId=" + studentId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
