package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.AlarmContacts;
import net.ssd.monitor.dao.mapper.AlarmContactsMapper;
import net.ssd.monitor.service.AlarmContactsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2020-12-23
 */
@Service
public class AlarmContactsServiceImpl extends ServiceImpl<AlarmContactsMapper, AlarmContacts> implements AlarmContactsService {

}
