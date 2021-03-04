package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liubin ON 2020/6/23 16:10
 * @param:
 * @return
 * @Description:店铺类别
 */
@Data
public class ShopCategory {

	// 主键ID
	private Long shopCategoryId;
	// 类别名
	private String shopCategoryName;
	// 类别描述
	private String shopCategoryDesc;
	// 类别图片地址(针对一级类别)
	private String shopCategoryImg;
	// 权重，越大越排前显示
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 最近的更新时间
	private Date lastEditTime;
	// 父类别
	private ShopCategory parent;

}
