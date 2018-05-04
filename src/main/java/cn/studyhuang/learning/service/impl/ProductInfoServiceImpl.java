/*
 * @(#) ProductInfoServiceImpl
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 15:02:15
 */

package cn.studyhuang.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import cn.studyhuang.learning.api.bean.ProductInfo;
import cn.studyhuang.learning.api.enums.ProductEnums;
import cn.studyhuang.learning.repository.ProductInfoRepository;
import cn.studyhuang.learning.service.ProductInfoService;
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository repository;
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {

        return  repository.findAll(pageable);
    }

    @Override
    public List<ProductInfo> findUpAll() {
     return repository.findAllByProductStatus(ProductEnums.UP.getCode());

    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {

        return repository.save(productInfo);
    }
}
