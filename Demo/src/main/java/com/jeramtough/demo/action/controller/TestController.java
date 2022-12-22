package com.jeramtough.demo.action.controller;

import com.jeramtough.demo.dto.LoginDTO;
import com.jeramtough.demo.dto.Who;
import com.jeramtough.demo.service.UserService;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.action.controller.BaseSwaggerController;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Created on 2019/7/25 11:36
 * by @author WeiBoWen
 */
@RestController
@Api(tags = {"测试接口"})
public class TestController extends BaseSwaggerController {

    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "获取资源", notes = "获取某些资源")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param", value = "参数也", paramType = "query",
                    required = true, dataType = "String", defaultValue = "JeramTough")})
    @RequestMapping(value = "/getSomething", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getSomething(String param) {
        return "test-" + param;
    }


    @ApiOperation(value = "获取个人信息", notes = "通过名字和日期获取某人信息")
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    @ApiResponses(value = {@ApiResponse(responseCode =  999, message = "发生某些异常")})
    @ResponseBody
    public CommonApiResponse<String> getInfoByWho(
            @RequestBody Who who) {

        return getSuccessfulApiResponse(userService.getUserInfo(who));
    }


    @ApiOperation(value = "登陆", notes = "通过名字和日期获取某人信息")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiResponses(value = {@ApiResponse(responseCode =  555, message = "传递参数【%s%s】校验失败，因为【%s】")})
    @ResponseBody
    public CommonApiResponse<Who> login(
            @RequestBody LoginDTO loginDTO) {

        return getSuccessfulApiResponse(userService.login(loginDTO));
    }

    @Override
    protected CommonApiResponse<String> handleException(HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        CommonApiResponse<String> failedApiResponse,
                                                        Exception e) {
        L.error(e);
        return super.handleException(request, response, failedApiResponse, e);
    }

  
}
