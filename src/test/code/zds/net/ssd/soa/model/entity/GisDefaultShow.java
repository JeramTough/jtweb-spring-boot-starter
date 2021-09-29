package net.ssd.soa.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-08
 */
@ApiModel(value="GisDefaultShow对象", description="")
public class GisDefaultShow implements Serializable {

    private static final long serialVersionUID=1L;

    private String uid;

    private String showCode;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getShowCode() {
        return showCode;
    }

    public void setShowCode(String showCode) {
        this.showCode = showCode;
    }

    @Override
    public String toString() {
        return "GisDefaultShow{" +
        "uid=" + uid +
        ", showCode=" + showCode +
        "}";
    }
}
