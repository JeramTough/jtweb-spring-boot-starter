package com.jeramtough.test;

import cn.hutool.core.util.ReflectUtil;
import com.alibaba.fastjson.JSONObject;
import com.jeramtough.jtcomponent.utils.ObjectsUtil;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtlog.config.SimpleLogConfigDefaultValues;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtlog.jtlogger.LoggerManager;
import io.swagger.annotations.ApiModelProperty;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.*;

/**
 * <pre>
 * Created on 2021/4/18 23:02
 * by @author WeiBoWen
 * </pre>
 */
public class DbTest {

    @Test
    public void test2() throws ClassNotFoundException {
        LoggerManager.setLogConfigDefaultValues(new SimpleLogConfigDefaultValues() {
            @Override
            public int decideWrapCount() {
                return 0;
            }
        });

        String packageName = "com.jeramtough.test.dto";
        // List<String> classNames = getClassName(packageName);
        List<String> classNames = PackageUtil.getClassName(packageName, false);
        Map<String,List<JSONObject>> tables=new HashMap();
        if (classNames != null) {

            for (String className : classNames) {
                List<JSONObject> objectList = new ArrayList<>();

                className = className.replace(".IdeaCodes.spring-boot-starter-jtweb2.target.test-classes.com" +
                        ".jeramtough.test.dto", "com.jeramtough.test.dto");
                Class clazz = Class.forName(className);
                Field[] fields = ReflectUtil.getFields(clazz);

                String tableName = className.replace("com.jeramtough.test.dto.", "");
                tableName = StringUtil.humpToLine(tableName).replace("_dto","");

                tables.put(tableName,objectList);


                for (Field field : fields) {
                    if (field.getName().equalsIgnoreCase("serialVersionUID")){
                        continue;
                    }
                    JSONObject jsonObject = new JSONObject();
                    if (ObjectsUtil.isBasicType(field.getType())) {
                        jsonObject.put("a", StringUtil.humpToLine(field.getName()));

                        ApiModelProperty apiModelProperty = field.getDeclaredAnnotation(ApiModelProperty.class);
                        if (apiModelProperty != null) {
                            jsonObject.put("b", apiModelProperty.value());
                        }
                        else {
                            jsonObject.put("b", "b");
                        }

                        if (clazz == Integer.class || clazz == Double.class || clazz == Float.class
                                || clazz == Long.class || clazz == Short.class) {
                            jsonObject.put("c", "int");
                            jsonObject.put("d", "12");
                        }
                        else if (clazz == Boolean.class) {
                            jsonObject.put("c", "bool");
                            jsonObject.put("d", "2");
                        }
                        else if (clazz == Date.class||clazz== LocalDate.class) {
                            jsonObject.put("c", "datetime");
                            jsonObject.put("d", "/");
                        }
                        else {
                            jsonObject.put("c", "varchar");
                            jsonObject.put("d", "30");
                        }

                        jsonObject.put("e", "否");

                        field.setAccessible(true);
                        if (field.getName().equalsIgnoreCase("fid") || field.getName().equalsIgnoreCase("id")) {
                            jsonObject.put("f", "是");
                        }
                        else {
                            jsonObject.put("f", "否");
                        }
                        objectList.add(jsonObject);
                    }

                }

            }
        }

        for (Map.Entry<String, List<JSONObject>> entry : tables.entrySet()) {
            L.p(entry.getKey()+"表设计");
            L.p("|  字段名称   | 字段介绍  | 字段类型  | 字段长度  | 是否为空  | 主键  |");
            L.p("| :----: | :----: | :----: | :----: | :----: | :----: |");

            for (JSONObject j : entry.getValue()) {
                L.p(String.format("| %s | %s | %s | %S | %s | %s |", j.getString("a"), j.getString("b"),
                        j.getString("c"), j.getString("d"), j.getString("e"), j.getString("f")));
            }
            L.p("\n");
        }




    }

}
