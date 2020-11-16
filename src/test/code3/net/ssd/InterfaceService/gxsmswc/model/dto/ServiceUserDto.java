package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="ServiceUser对象", description="")
public class ServiceUserDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String userSex;

    @ApiModelProperty(value = "出生日期")
    private LocalDate userBirthday;

    @ApiModelProperty(value = "是否是vip")
    @TableField("user_isVIP")
    private String userIsvip;

    @ApiModelProperty(value = "备注")
    private String userMark;

    @ApiModelProperty(value = "编号")
    private Integer userNum;

    @ApiModelProperty(value = "最后一次修改日期")
    @TableField("user_addDate")
    private LocalDate userAdddate;

    private String userTel;

    private String userEmail;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userName;


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(LocalDate userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserIsvip() {
        return userIsvip;
    }

    public void setUserIsvip(String userIsvip) {
        this.userIsvip = userIsvip;
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public LocalDate getUserAdddate() {
        return userAdddate;
    }

    public void setUserAdddate(LocalDate userAdddate) {
        this.userAdddate = userAdddate;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ServiceUser{" +
        "userSex=" + userSex +
        ", userBirthday=" + userBirthday +
        ", userIsvip=" + userIsvip +
        ", userMark=" + userMark +
        ", userNum=" + userNum +
        ", userAdddate=" + userAdddate +
        ", userTel=" + userTel +
        ", userEmail=" + userEmail +
        ", id=" + id +
        ", userName=" + userName +
        "}";
    }
}
