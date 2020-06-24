package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liubin ON 2020/6/23 16:11
 * @param:
 * @return
 * @Description:微信登录
 */
@Data
public class WechatAuth {
	// 主键ID
	private Long wechatAuthId;
	// 微信获取用户信息的凭证，对于某个公众号具有唯一性
	private String openId;
	// 创建时间
	private Date createTime;
	// 用户信息
	private PersonInfo personInfo;

}
