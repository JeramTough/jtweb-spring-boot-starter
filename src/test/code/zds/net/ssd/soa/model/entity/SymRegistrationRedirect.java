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
@ApiModel(value="SymRegistrationRedirect对象", description="")
public class SymRegistrationRedirect implements Serializable {

    private static final long serialVersionUID=1L;

    private String registrantExternalId;

    private String registrationNodeId;


    public String getRegistrantExternalId() {
        return registrantExternalId;
    }

    public void setRegistrantExternalId(String registrantExternalId) {
        this.registrantExternalId = registrantExternalId;
    }

    public String getRegistrationNodeId() {
        return registrationNodeId;
    }

    public void setRegistrationNodeId(String registrationNodeId) {
        this.registrationNodeId = registrationNodeId;
    }

    @Override
    public String toString() {
        return "SymRegistrationRedirect{" +
        "registrantExternalId=" + registrantExternalId +
        ", registrationNodeId=" + registrationNodeId +
        "}";
    }
}
