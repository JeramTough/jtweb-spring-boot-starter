package net.ssd.BSM.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2020-09-24
 */
@ApiModel(value="InterfaceAuth对象", description="")
public class InterfaceAuthDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "表主键id")
    private Integer id;

    @ApiModelProperty(value = "接口名")
    private String interfaceName;

    @ApiModelProperty(value = "接口url")
    private String interfaceUrl;

    @ApiModelProperty(value = "请求方法")
    private String requestMethod;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "模块Id")
    private Integer moduleId;

    @ApiModelProperty(value = "模块名")
    private String moduleName;

    @ApiModelProperty(value = "跳转方式 1 self 页面跳转 2 _blank新页面打开")
    private String moduleOpenMode;

    @ApiModelProperty(value = "状态 1 正常 2 停用")
    private Integer moduleStatus;

    @ApiModelProperty(value = "模块排序")
    private Integer moduleSort;

    @ApiModelProperty(value = "模块url")
    private String moduleUrl;

    @ApiModelProperty(value = "父模块Id")
    private Integer moduleParentId;

    @ApiModelProperty(value = "是否授权")
    private Integer isAuth;

    @ApiModelProperty(value = "角色Id")
    private Integer roleId;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "接口Id")
    private Integer interfaceId;

    @ApiModelProperty(value = "平台Id")
    private Integer platformId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceUrl() {
        return interfaceUrl;
    }

    public void setInterfaceUrl(String interfaceUrl) {
        this.interfaceUrl = interfaceUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleOpenMode() {
        return moduleOpenMode;
    }

    public void setModuleOpenMode(String moduleOpenMode) {
        this.moduleOpenMode = moduleOpenMode;
    }

    public Integer getModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
    }

    public Integer getModuleSort() {
        return moduleSort;
    }

    public void setModuleSort(Integer moduleSort) {
        this.moduleSort = moduleSort;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public Integer getModuleParentId() {
        return moduleParentId;
    }

    public void setModuleParentId(Integer moduleParentId) {
        this.moduleParentId = moduleParentId;
    }

    public Integer getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Integer isAuth) {
        this.isAuth = isAuth;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    @Override
    public String toString() {
        return "InterfaceAuth{" +
        "id=" + id +
        ", interfaceName=" + interfaceName +
        ", interfaceUrl=" + interfaceUrl +
        ", requestMethod=" + requestMethod +
        ", remark=" + remark +
        ", moduleId=" + moduleId +
        ", moduleName=" + moduleName +
        ", moduleOpenMode=" + moduleOpenMode +
        ", moduleStatus=" + moduleStatus +
        ", moduleSort=" + moduleSort +
        ", moduleUrl=" + moduleUrl +
        ", moduleParentId=" + moduleParentId +
        ", isAuth=" + isAuth +
        ", roleId=" + roleId +
        ", createTime=" + createTime +
        ", interfaceId=" + interfaceId +
        ", platformId=" + platformId +
        "}";
    }
}
