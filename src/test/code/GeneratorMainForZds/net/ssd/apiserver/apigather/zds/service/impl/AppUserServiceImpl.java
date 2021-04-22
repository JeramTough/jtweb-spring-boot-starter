package net.ssd.apiserver.apigather.zds.service.impl;

import net.ssd.apiserver.apigather.zds.model.entity.AppUser;
import net.ssd.apiserver.apigather.zds.dao.mapper.AppUserMapper;
import net.ssd.apiserver.apigather.zds.service.AppUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-03-08
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements AppUserService {

}
