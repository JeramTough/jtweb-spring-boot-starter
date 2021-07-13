package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.AlarmNotify;
import net.ssd.monitor.dao.mapper.AlarmNotifyMapper;
import net.ssd.monitor.service.AlarmNotifyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 告警联系人 告警规则 关联表 服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-04-27
 */
@Service
public class AlarmNotifyServiceImpl extends ServiceImpl<AlarmNotifyMapper, AlarmNotify> implements AlarmNotifyService {

}
