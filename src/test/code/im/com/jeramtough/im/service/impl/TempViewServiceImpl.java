package com.jeramtough.im.service.impl;

import com.jeramtough.im.model.entity.TempView;
import com.jeramtough.im.dao.mapper.TempViewMapper;
import com.jeramtough.im.service.TempViewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * View 'im_db.temp_view' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them 服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-10-22
 */
@Service
public class TempViewServiceImpl extends ServiceImpl<TempViewMapper, TempView> implements TempViewService {

}
