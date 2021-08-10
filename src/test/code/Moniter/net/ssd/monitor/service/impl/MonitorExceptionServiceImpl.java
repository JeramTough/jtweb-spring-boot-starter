package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.MonitorException;
import net.ssd.monitor.dao.mapper.MonitorExceptionMapper;
import net.ssd.monitor.service.MonitorExceptionService;
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
public class MonitorExceptionServiceImpl extends ServiceImpl<MonitorExceptionMapper, MonitorException> implements MonitorExceptionService {

}
