package net.ssd.monitor.service.impl;

import net.ssd.monitor.model.entity.AlarmRule;
import net.ssd.monitor.dao.mapper.AlarmRuleMapper;
import net.ssd.monitor.service.AlarmRuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 告警规则表 ， 定义该规则信息 服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2020-12-23
 */
@Service
public class AlarmRuleServiceImpl extends ServiceImpl<AlarmRuleMapper, AlarmRule> implements AlarmRuleService {

}
