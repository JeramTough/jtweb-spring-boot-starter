package net.ssd.component.document.service.impl;

import net.ssd.component.document.model.entity.DocumentProduct;
import net.ssd.component.document.dao.mapper.DocumentProductMapper;
import net.ssd.component.document.service.DocumentProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-02-19
 */
@Service
public class DocumentProductServiceImpl extends ServiceImpl<DocumentProductMapper, DocumentProduct> implements DocumentProductService {

}
