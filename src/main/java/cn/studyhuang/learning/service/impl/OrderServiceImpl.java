/*
 * @(#) OrderServiceImpl
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 10:09:54
 */

package cn.studyhuang.learning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import cn.studyhuang.learning.api.bean.OrderDetail;
import cn.studyhuang.learning.api.bean.OrderMaster;
import cn.studyhuang.learning.api.vo.OrderVO;
import cn.studyhuang.learning.repository.OrderDetailRepository;
import cn.studyhuang.learning.repository.OrderMasterRepository;
import cn.studyhuang.learning.service.OrderService;
import cn.studyhuang.learning.service.ProductCategoryService;
import cn.studyhuang.learning.service.ProductInfoService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderVO save(OrderVO orderVO) {

        for (OrderDetail orderDetail : orderVO.getOrderDetailList()){

        }
        return null;
    }

    @Override
    public OrderVO findOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderVO> findByOpenId(String openId, Pageable pageable) {
        return null;
    }

    @Override
    public OrderVO cancelOrder(OrderVO orderVO) {
        return null;
    }

    @Override
    public OrderVO finishOrder(OrderVO orderVO) {
        return null;
    }

    @Override
    public OrderVO payOrder(OrderVO orderVO) {
        return null;
    }

    @Override
    public List<OrderVO> findList(Pageable pageable) {
       Page<OrderMaster> orderMasters = orderMasterRepository.findAll(pageable);
        return null;
    }
}
