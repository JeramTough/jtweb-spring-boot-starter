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
@ApiModel(value="SymNodeIdentity对象", description="")
public class SymNodeIdentityDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String nodeId;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return "SymNodeIdentity{" +
        "nodeId=" + nodeId +
        "}";
    }
}
