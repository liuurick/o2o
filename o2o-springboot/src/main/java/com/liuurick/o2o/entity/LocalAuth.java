package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 本地验证实体类，主要用来做帐号密码的登录
 * @author liubin
 */
@Data
public class LocalAuth {
	// 主键ID
	private Long localAuthId;
	// 帐号
	private String username;
	// 密码
	private String password;
	// 创建时间
	private Date createTime;
	// 最近一次的更新时间
	private Date lastEditTime;
	// 个人信息，关系为一一对应
	private PersonInfo personInfo;

}
