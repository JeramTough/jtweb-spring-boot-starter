package net.ssd.component.document.service.impl;

import net.ssd.component.document.model.entity.DocumentTemplate;
import net.ssd.component.document.dao.mapper.DocumentTemplateMapper;
import net.ssd.component.document.service.DocumentTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文档模版表 服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-02-19
 */
@Service
public class DocumentTemplateServiceImpl extends ServiceImpl<DocumentTemplateMapper, DocumentTemplate> implements DocumentTemplateService {

}
