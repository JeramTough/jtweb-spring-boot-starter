package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.AlarmRuleDescribe;
import net.ssd.monitor.dao.mapper.AlarmRuleDescribeMapper;
import net.ssd.monitor.service.AlarmRuleDescribeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 规则描述表 定义了该规则的行为 服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-04-27
 */
@Service
public class AlarmRuleDescribeServiceImpl extends ServiceImpl<AlarmRuleDescribeMapper, AlarmRuleDescribe> implements AlarmRuleDescribeService {

}
