/*
 * @(#) ProductInfoServiceImplTest
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 15:25:09
 */

package cn.studyhuang.learning.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.studyhuang.learning.api.bean.ProductInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() {
       ProductInfo productInfo = productInfoService.findOne("1234");
        System.out.println(productInfo.toString());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfos =productInfoService.findAll(request);
        System.out.println(productInfos.getTotalElements()+"111");
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(1);
        productInfo.setProductName("dian脑");
        productInfo.setProductDescription("sdsdsdsd");
        productInfo.setProductId("1235");
        productInfo.setProductStatus(0);
        productInfo.setProductPrice(1500);
        productInfo.setProductStock(10);
        productInfoService.save(productInfo);
    }
}