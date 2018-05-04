/*
 * @(#) ProductCategoryServiceImplTest
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 14:29:49
 */

package cn.studyhuang.learning.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import cn.studyhuang.learning.api.bean.ProductCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    private ProductCategoryServiceImpl  categoryService;
    @Test
    public void findOne() {
      ProductCategory productCategory=categoryService.findOne(2);
        System.out.println(productCategory.toString());
    }

    @Test
    public void getAll() {
        List<ProductCategory> list = categoryService.getAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {

    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(2);
        productCategory.setCategoryName("鞋类");
        productCategory.setCategoryId(4);
        categoryService.save(productCategory);
    }
}