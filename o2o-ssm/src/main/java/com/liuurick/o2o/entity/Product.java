package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: liubin ON 2020/6/23 16:08
 * @param:
 * @return
 * @Description: 商品
 */
@Data
public class Product {
	// 主键ID
	private Long productId;
	// 商品名
	private String productName;
	// 商品简介
	private String productDesc;
	// 简略图
	private String imgAddr;
	// 原价
	private String normalPrice;
	// 现价(推广价格)
	private String promotionPrice;
	// 权重，越大越排前显示
	private Integer priority;
	// 商品积分
	private Integer point;
	// 创建时间
	private Date createTime;
	// 最近一次的更新时间
	private Date lastEditTime;
	// 0.下架 1.在前端展示系统展示
	private Integer enableStatus;

	// 图片详情图列表，跟商品是多对一的关系
	private List<ProductImg> productImgList;
	// 商品类别，一件商品仅属于一个商品类别
	private ProductCategory productCategory;
	// 店铺实体类，标明商品属于哪个店铺
	private Shop shop;

}
