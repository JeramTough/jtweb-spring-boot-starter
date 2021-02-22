package com.jeramtough.studentmanager.service.impl;

import com.jeramtough.studentmanager.model.entity.SmUser;
import com.jeramtough.studentmanager.dao.mapper.SmUserMapper;
import com.jeramtough.studentmanager.service.SmUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiJieHui
 * @since 2020-12-22
 */
@Service
public class SmUserServiceImpl extends ServiceImpl<SmUserMapper, SmUser> implements SmUserService {

}
