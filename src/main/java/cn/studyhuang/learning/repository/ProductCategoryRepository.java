/*
 * @(#) ProductCategoryRepository
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 11:10:54
 */

package cn.studyhuang.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import cn.studyhuang.learning.api.bean.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    @Override
    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
}
