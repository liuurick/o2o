package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liubin ON 2020/6/23 16:08
 * @param:
 * @return
 * @Description:商品图片
 */

@Data
public class ProductImg {
	// 主键ID
	private Long productImgId;
	// 图片地址
	private String imgAddr;
	// 图片简介
	private String imgDesc;
	// 权重，越大越排前显示
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 标明是属于哪个商品的图片
	private Long productId;

}
