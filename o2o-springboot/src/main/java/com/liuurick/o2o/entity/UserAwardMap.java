package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 顾客已领取的奖品映射
 * @author liubin
 */
@Data
public class UserAwardMap {
	// 主键Id
	private Long userAwardId;
	// 创建时间
	private Date createTime;
	// 使用状态0.未兑换 1.已兑换
	private Integer usedStatus;
	// 领取奖品所消耗的积分
	private Integer point;
	// 顾客信息实体类
	private PersonInfo user;
	// 奖品信息实体类
	private Award award;
	// 店铺信息实体类
	private Shop shop;
	// 操作员信息实体类
	private PersonInfo operator;

}
