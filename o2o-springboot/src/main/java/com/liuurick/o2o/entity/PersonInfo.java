package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 个人信息实体类
 * @author liubin
 */
@Data
public class PersonInfo {
	// 主键ID
	private Long userId;
	// 用户名称
	private String name;
	// 用户头像
	private String profileImg;
	// 用户邮箱
	private String email;
	// 用户性别
	private String gender;
	// 可用状态：0、被禁止 1、可用
	private Integer enableStatus;
	// 1.顾客 2.店家 3.超级管理员
	private Integer userType;
	// 创建时间
	private Date createTime;
	// 最近一次的更新时间
	private Date lastEditTime;

}
