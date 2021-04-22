package net.ssd.apiserver.apigather.zds.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-03-08
 */
@ApiModel(value="ZdsRegister对象", description="")
public class ZdsRegisterDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    private String username;

    private String userpassword;

    private String area;

    private String belong;

    private String cityBelong;

    private Integer idInout;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getCityBelong() {
        return cityBelong;
    }

    public void setCityBelong(String cityBelong) {
        this.cityBelong = cityBelong;
    }

    public Integer getIdInout() {
        return idInout;
    }

    public void setIdInout(Integer idInout) {
        this.idInout = idInout;
    }

    @Override
    public String toString() {
        return "ZdsRegister{" +
        "id=" + id +
        ", username=" + username +
        ", userpassword=" + userpassword +
        ", area=" + area +
        ", belong=" + belong +
        ", cityBelong=" + cityBelong +
        ", idInout=" + idInout +
        "}";
    }
}
