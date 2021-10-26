package com.jeramtough.im.action.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

/**
 * <p>
 * View 'im_db.temp_view' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them 前端控制器
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-10-22
 */
@Api(tags = {"TempViewController"})
@RestController
@RequestMapping("/tempView")
public class TempViewController {

}

