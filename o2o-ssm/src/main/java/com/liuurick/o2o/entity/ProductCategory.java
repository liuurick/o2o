package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liubin ON 2020/6/23 16:08
 * @param:
 * @return
 * @Description:商品分类
 */

@Data
public class ProductCategory {
	// 主键ID
	private Long productCategoryId;
	// 该类别是属于哪个店铺的
	private Long shopId;
	// 类别名
	private String productCategoryName;
	// 权重，越大越排前显示
	private Integer priority;
	// 创建时间
	private Date createTime;

}
