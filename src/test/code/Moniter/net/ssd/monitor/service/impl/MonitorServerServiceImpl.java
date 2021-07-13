package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.MonitorServer;
import net.ssd.monitor.dao.mapper.MonitorServerMapper;
import net.ssd.monitor.service.MonitorServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-04-27
 */
@Service
public class MonitorServerServiceImpl extends ServiceImpl<MonitorServerMapper, MonitorServer> implements MonitorServerService {

}
