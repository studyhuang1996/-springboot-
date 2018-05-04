/*
 * @(#) ProductEnums
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 16:30:08
 */

package cn.studyhuang.learning.api.enums;

public enum  ProductEnums implements CodeEnum {
    UP(0,"上架"),
    DOWN(1,"下架");

    Integer code;
    String name;

     ProductEnums(Integer code,String name){
       this.code = code;
       this.name = name;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
