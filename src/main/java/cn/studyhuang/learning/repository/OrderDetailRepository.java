/*
 * @(#) OrderDetailRepository
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 09:52:45
 */

package cn.studyhuang.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import cn.studyhuang.learning.api.bean.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
