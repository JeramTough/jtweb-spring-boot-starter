package com.jeramtough.randl2.service.impl;

import com.jeramtough.randl2.model.entity.Permission;
import com.jeramtough.randl2.dao.mapper.PermissionMapper;
import com.jeramtough.randl2.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
