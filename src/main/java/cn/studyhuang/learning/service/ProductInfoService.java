/*
 * @(#) ProductInfoService
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 14:56:33
 */

package cn.studyhuang.learning.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

import cn.studyhuang.learning.api.bean.ProductInfo;

public interface ProductInfoService {
    /**
     * 找到详情
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * 分页查找列表
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 上架
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 保存更新
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

}
