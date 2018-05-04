/*
 * @(#) OrderService
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 09:57:36
 */

package cn.studyhuang.learning.service;

import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

import cn.studyhuang.learning.api.vo.OrderVO;

public interface OrderService {

    /**
     * 创建订单
     * @param orderVO
     * @return
     */
    OrderVO save(OrderVO orderVO);

    /**
     * 通过订单id查找订单
     * @param orderId
     * @return
     */
    OrderVO findOne(String orderId);

    /**
     * 通过用户id分页查找订单列表
     * @param openId
     * @param pageable
     * @return
     */
    Page<OrderVO> findByOpenId(String openId, Pageable pageable);

    /**
     * 取消订单
     * @param orderVO
     * @return
     */
    OrderVO cancelOrder(OrderVO orderVO);

    /**
     *
     * @param orderVO
     * @return
     */
    OrderVO finishOrder(OrderVO orderVO);

    /**
     *
     * @param orderVO
     * @return
     */
    OrderVO payOrder(OrderVO orderVO);

    /**
     * 查找所有订单
     * @param pageable
     * @return
     */
    List<OrderVO> findList(Pageable pageable);

}
