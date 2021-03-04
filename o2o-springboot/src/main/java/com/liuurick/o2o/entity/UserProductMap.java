package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 顾客消费的商品映射
 * @author liubin
 */
@Data
public class UserProductMap {
	// 主键Id
	private Long userProductId;
	// 创建时间
	private Date createTime;
	// 消费商品所获得的积分
	private Integer point;
	// 顾客信息实体类
	private PersonInfo user;
	// 商品信息实体类
	private Product product;
	// 店铺信息实体类
	private Shop shop;
	// 操作员信息实体类
	private PersonInfo operator;

}
