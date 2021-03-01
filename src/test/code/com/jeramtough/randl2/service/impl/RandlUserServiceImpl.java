package com.jeramtough.randl2.service.impl;

import com.jeramtough.randl2.model.entity.RandlUser;
import com.jeramtough.randl2.dao.mapper.RandlUserMapper;
import com.jeramtough.randl2.service.RandlUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * RandL系统的用户表 服务实现类
 * </p>
 *
 * @author JeramTough
 * @since 2021-02-22
 */
@Service
public class RandlUserServiceImpl extends ServiceImpl<RandlUserMapper, RandlUser> implements RandlUserService {

}
