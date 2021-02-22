package com.jeramtough.jtweb.component.optlog.bean;

/**
 * <pre>
 * Created on 2020/11/11 15:40
 * by @author WeiBoWen
 * </pre>
 */
public enum ApiTypeEnum {

    /**
     * 增
     */
    INSERT("insert"),

    /**
     * 查
     */
    SELECT("select"),

    /**
     * 改
     */
    UPDATE("update"),

    /**
     * 删
     */
    DELETE("delete"),

    /**
     * 其他
     */
    OTHER("other");

    private String type;

    ApiTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static ApiTypeEnum get(String type){
        for (ApiTypeEnum typeEnum : ApiTypeEnum.values()) {
            if (typeEnum.getType().equalsIgnoreCase(type)){
                return typeEnum;
            }
        }
        return null;
    }
}
