package com.jeramtough.demo.service.impl;

import com.jeramtough.demo.dto.LoginDTO;
import com.jeramtough.demo.dto.Who;
import com.jeramtough.demo.service.UserService;
import com.jeramtough.jtweb.component.apiresponse.BeanValidator;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import org.springframework.stereotype.Service;

/**
 * Created on 2019/7/26 14:34
 * by @author WeiBoWen
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo(Who who) {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            throw new ApiResponseException(999);
        }
        else if (random == 1) {
            throw new RuntimeException();
        }
        return who.toString();
    }

    @Override
    public Who login(LoginDTO loginDTO) {

        BeanValidator.verifyDto(loginDTO);

        Who who = new Who();
        who.setName("weibw@hwagain.com");
        return who;
    }

}
