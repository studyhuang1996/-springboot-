/*
 * @(#) ResultVO
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-03 16:54:07
 */

package cn.studyhuang.learning.api.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;

    private  String msg;

    private T data;
}
