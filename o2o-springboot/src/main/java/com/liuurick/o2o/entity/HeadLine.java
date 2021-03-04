package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * 头条实体类
 * @author liubin
 */
@Data
public class HeadLine {

	/**
	 * 主键ID
 	 */
	private Long lineId;

	/**
	 * 头条名字
 	 */
	private String lineName;

	/**
	 * 头条链接，点击头条会进入相应链接中
 	 */
	private String lineLink;
	/**
	 * 头条图片
 	 */
	private String lineImg;

	/**
	 * 权重，越大越排前显示
 	 */
	private Integer priority;

	/**
	 * 0.不可用 1.可用
 	 */
	private Integer enableStatus;

	/**
	 * 创建时间
 	 */
	private Date createTime;

	/**
	 * 最近一次的更新时间
 	 */
	private Date lastEditTime;

}
