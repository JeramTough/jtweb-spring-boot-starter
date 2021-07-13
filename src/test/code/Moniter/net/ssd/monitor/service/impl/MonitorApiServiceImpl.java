package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.MonitorApi;
import net.ssd.monitor.dao.mapper.MonitorApiMapper;
import net.ssd.monitor.service.MonitorApiService;
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
public class MonitorApiServiceImpl extends ServiceImpl<MonitorApiMapper, MonitorApi> implements MonitorApiService {

}
