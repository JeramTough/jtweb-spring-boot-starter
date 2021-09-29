package com.jeramtough.im.service.impl;

import com.jeramtough.im.model.entity.SmUser;
import com.jeramtough.im.dao.mapper.SmUserMapper;
import com.jeramtough.im.service.SmUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiJieHui
 * @since 2021-08-24
 */
@Service
public class SmUserServiceImpl extends ServiceImpl<SmUserMapper, SmUser> implements SmUserService {

}
