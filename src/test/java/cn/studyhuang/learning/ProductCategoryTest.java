/*
 * @(#) ProductCategoryTest
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 11:43:30
 */

package cn.studyhuang.learning;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.studyhuang.learning.api.bean.ProductCategory;
import cn.studyhuang.learning.repository.ProductCategoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void saveProduct(){
     ProductCategory productCategory =new ProductCategory();
     productCategory.setCategoryId(2);
     productCategory.setCategoryName("衣服类");
     productCategory.setCategoryType(1);
     productCategory.setUpdateTime(new Date());
     productCategoryRepository.save(productCategory);
    }

    @Test
    public void findOne(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public  void test1(){
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(10);
        List<ProductCategory> productCategories = productCategoryRepository.findByCategoryTypeIn(lists);
        Assert.assertNotEquals(0,productCategories.size());
    }
}
