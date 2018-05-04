/*
 * @(#) OrderVO
 * 订单vo
 * <br> @author huang
 * <br> 2018-05-04 09:48:34
 */

package cn.studyhuang.learning.api.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import cn.studyhuang.learning.api.bean.OrderDetail;
import lombok.Data;

@Data
public class OrderVO {


    private String orderId;
    //买家名字
    private String buyerName;//
    private String buyerPhone;//买家电话
    private String buyerAddress;//买家地址
    private String buyerOpenid;//买家微信openid
    private BigDecimal orderAmount;//订单总金额
    private Integer orderStatus;//订单状态默认为新下单
    private Integer payStatus;//支付状态默认未支付0
    private Date createTime;//创建时间
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

}
