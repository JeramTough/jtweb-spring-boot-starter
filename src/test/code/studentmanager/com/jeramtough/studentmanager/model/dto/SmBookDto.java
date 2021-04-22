package com.jeramtough.studentmanager.model.entity;

import java.math.BigDecimal;
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
 * @author WeiJieHui
 * @since 2021-03-07
 */
@ApiModel(value="SmBook对象", description="")
public class SmBookDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private String name;

    private BigDecimal price;

    private Long courseId;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "SmBook{" +
        "fid=" + fid +
        ", name=" + name +
        ", price=" + price +
        ", courseId=" + courseId +
        "}";
    }
}
