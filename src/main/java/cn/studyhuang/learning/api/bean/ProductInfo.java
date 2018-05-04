/*
 * @(#) ProductInfo
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 09:29:58
 */

package cn.studyhuang.learning.api.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * 商品信息表
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private double productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;//商品状态,0正常1下架
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

}
