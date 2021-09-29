package com.jeramtough.im.service.impl;

import com.jeramtough.im.model.entity.SmPushMessage;
import com.jeramtough.im.dao.mapper.SmPushMessageMapper;
import com.jeramtough.im.service.SmPushMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-23
 */
@Service
public class SmPushMessageServiceImpl extends ServiceImpl<SmPushMessageMapper, SmPushMessage> implements SmPushMessageService {

}
