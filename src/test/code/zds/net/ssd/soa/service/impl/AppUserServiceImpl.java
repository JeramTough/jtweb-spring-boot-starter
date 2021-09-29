package net.ssd.soa.service.impl;

import net.ssd.soa.model.entity.AppUser;
import net.ssd.soa.dao.mapper.AppUserMapper;
import net.ssd.soa.service.AppUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-08
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements AppUserService {

}
