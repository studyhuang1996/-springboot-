/*
 * @(#) SellerInfo
 * 卖家信息
 * <br> @author huang
 * <br> 2018-05-04 09:45:13
 */

package cn.studyhuang.learning.api.bean;

import java.util.Date;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

    private Date createTime;

    private Date updateTime;
}
