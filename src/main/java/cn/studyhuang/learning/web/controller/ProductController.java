/*
 * @(#) ProductController
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 17:08:09
 */

package cn.studyhuang.learning.web.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import cn.studyhuang.learning.service.ProductCategoryService;
import cn.studyhuang.learning.service.ProductInfoService;
import cn.studyhuang.learning.api.bean.ProductCategory;
import cn.studyhuang.learning.api.bean.ProductInfo;
import cn.studyhuang.learning.api.vo.ProductInfoVO;
import cn.studyhuang.learning.api.vo.ProductVO;
import cn.studyhuang.learning.api.vo.ResultVO;

@RestController
@RequestMapping("buyer/product")
public class ProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 商品类表
     * @return
     */
    @GetMapping("list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        List<ProductInfo> productInfos = productInfoService.findUpAll();
        List<Integer> categoryIds = new ArrayList<>();
        for (ProductInfo productInfo : productInfos){
            categoryIds.add(productInfo.getCategoryType());
        }
        List<ProductCategory> categories = productCategoryService.findByCategoryTypeIn(categoryIds);
        List<ProductVO> productVOS = new ArrayList<>();
        for (ProductCategory productCategory:categories){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVO> productInfoList = new ArrayList<ProductInfoVO>();

            for (ProductInfo productInfo :productInfos){

                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOS(productInfoList);
            productVOS.add(productVO);
        }
        resultVO.setData(productVOS);
        resultVO.setCode(0);
        resultVO.setMsg("success");
        return resultVO;

    }
}
