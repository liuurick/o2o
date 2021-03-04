package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 微信登录实体类
 * @author liubin
 */
@Data
public class WechatAuth {

	/**
	 * 主键ID
 	 */
	private Long wechatAuthId;

	/**
	 * 	微信获取用户信息的凭证，对于某个公众号具有唯一性
 	 */
	private String openId;

	/**
	 * 	创建时间
 	 */
	private Date createTime;

	/**
	 * 用户信息
 	 */
	private PersonInfo personInfo;
}
