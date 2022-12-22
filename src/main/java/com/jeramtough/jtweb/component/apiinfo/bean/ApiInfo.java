package com.jeramtough.jtweb.component.apiinfo.bean;

/**
 * <pre>
 * Created on 2022/12/22 上午10:33
 * by @author WeiBoWen
 * </pre>
 */
public class ApiInfo {

    private String path;

    private String methodName;

    private String groupName;

    private String description;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ApiInfo apiInfo = (ApiInfo) o;

        if (!path.equals(apiInfo.path)) {
            return false;
        }
        if (!methodName.equals(apiInfo.methodName)) {
            return false;
        }
        return groupName.equals(apiInfo.groupName);
    }

    @Override
    public int hashCode() {
        int result = path.hashCode();
        result = 31 * result + methodName.hashCode();
        result = 31 * result + groupName.hashCode();
        return result;
    }
}
