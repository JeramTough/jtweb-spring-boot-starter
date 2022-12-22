package com.jeramtough.jtweb.model.params;

import com.alibaba.fastjson2.annotation.JSONField;
import com.jeramtough.jtweb.component.validation.constraints.NotBlankButNull;
import com.jeramtough.jtweb.model.error.ErrorU;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <pre>
 * Created on 2020/10/30 16:56
 * by @author WeiBoWen
 * </pre>
 */
@Schema
public class BaseConditionParams {


    @Schema(description = "关键词", example = "某某", required = false)
    @NotBlankButNull(payload = ErrorU.CODE_2.class, isSetNullAuto = true)
    private String keyword;

    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Schema(description = "时间环查询的开始日期", example = "1996-02-23", required = false)
    private LocalDate startDate;

    @JSONField(format = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Schema(description = "时间环查询的结束日期", example = "2021-02-23", required = false)
    private LocalDate endDate;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "时间环查询的开始时间", example = "1996-02-23 00:00:00", required = false)
    private LocalDateTime startTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "时间环查询的结束时间", example = "2021-02-23 23:59:59", required = false)
    private LocalDateTime endTime;

    @Schema(description = "根据什么字段排序，或者时间环的key,可以用逗号排序多个", example = "fid,id", required =
            false)
    private String orderBy;

    @Schema(description = "根据什么字段时间环的key,可以用逗号排序多个", example = "fid,id", required =
            false)
    private String timeBy;

    @Schema(description = "是否升序", example = "true", required = false)
    private Boolean isAsc = true;


    public String getTimeBy() {
        return timeBy;
    }

    public void setTimeBy(String timeBy) {
        this.timeBy = timeBy;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(Boolean isAsc) {
        this.isAsc = isAsc;
    }

    public Boolean isAsc() {
        return isAsc;
    }

    public void setAsc(Boolean asc) {
        isAsc = asc;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
