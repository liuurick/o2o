package com.liuurick.o2o.dto;

import java.util.List;

import com.liuurick.o2o.entity.ShopCategory;
import com.liuurick.o2o.enums.ShopCategoryStateEnum;
import lombok.Data;

@Data
public class ShopCategoryExecution {
	// 结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	private ShopCategory shopCategory;

	// 操作的商铺类别
	private List<ShopCategory> shopCategoryList;


	public ShopCategoryExecution(ShopCategoryStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	public ShopCategoryExecution(ShopCategoryStateEnum stateEnum, ShopCategory shopCategory) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shopCategory = shopCategory;
	}

	public ShopCategoryExecution(ShopCategoryStateEnum stateEnum, List<ShopCategory> shopCategoryList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shopCategoryList = shopCategoryList;
	}

}
