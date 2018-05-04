/*
 * @(#) SellException
 * 自定义异常
 * <br> @author huang
 * <br> 2018-05-04 10:20:38
 */

package cn.studyhuang.learning.api.exception;

import cn.studyhuang.learning.api.enums.ResultEnum;

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
    public SellException(String message,Integer code){
        super(message);
        this.code=code;
    }
}
