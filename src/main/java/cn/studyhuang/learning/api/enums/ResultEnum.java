/*
 * @(#) ResultEnum
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 10:23:54
 */

package cn.studyhuang.learning.api.enums;

import lombok.Getter;

@Getter
public enum  ResultEnum {
    SUCCESS(0,"成功")
    ,PRODUCT_NOT_EXIST(10,"商品不存在")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
