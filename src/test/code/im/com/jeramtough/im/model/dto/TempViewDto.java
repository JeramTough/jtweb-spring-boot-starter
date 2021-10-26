package com.jeramtough.im.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * View 'im_db.temp_view' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-10-22
 */
@ApiModel(value="TempView对象", description="View 'im_db.temp_view' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them")
public class TempViewDto implements Serializable{

    private static final long serialVersionUID=1L;


    @Override
    public String toString() {
        return "TempView{" +
        "}";
    }
}
