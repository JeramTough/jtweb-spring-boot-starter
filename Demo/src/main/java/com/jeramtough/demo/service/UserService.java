package com.jeramtough.demo.service;

import com.jeramtough.demo.dto.LoginDTO;
import com.jeramtough.demo.dto.Who;

/**
 * Created on 2019/7/26 14:33
 * by @author WeiBoWen
 */
public interface UserService {

    String getUserInfo(Who who);

    Who login(LoginDTO loginDTO);
}
