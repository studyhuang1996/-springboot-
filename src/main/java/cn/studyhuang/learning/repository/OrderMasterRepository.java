/*
 * @(#) OrderMasterRepository
 * 版权声明 厦门畅享信息技术有限公司, 版权所有 违者必究
 *
 * <br> Copyright:  Copyright (c) 2018
 * <br> Company:厦门畅享信息技术有限公司
 * <br> @author huang
 * <br> 2018-05-04 09:53:47
 */

package cn.studyhuang.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.studyhuang.learning.api.bean.OrderMaster;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
