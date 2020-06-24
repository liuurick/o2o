package com.liuurick.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liubin ON 2020/6/23 16:06
 * @param:
 * @return
 * @Description:区域信息
 */
@Data
public class Area {
	// 主键ID
	private Integer areaId;
	// 名称
	private String areaName;
	// 权重，越大越排前显示
	private Integer priority;
	// 创建时间
	private Date createTime;
	// 更新时间
	private Date lastEditTime;

}
