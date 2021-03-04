package com.liuurick.o2o.dto;

import java.util.List;

import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.enums.AreaStateEnum;
import lombok.Data;

@Data
public class AreaExecution {
	/**
	 * 结果状态
 	 */
	private int state;

	/**
	 * 状态标识
	 */
	private String stateInfo;

	/**
	 * 店铺数量
 	 */
	private int count;

	/**
	 * 操作的award（增删改商品的时候用）
 	 */
	private Area area;

	/**
	 * 获取的award列表(查询商品列表的时候用)
 	 */
	private List<Area> areaList;

	public AreaExecution() {
	}

	/**
	 * 失败的构造器
	 * @param stateEnum
	 */
	public AreaExecution(AreaStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	/**
	 * 成功的构造器
	 * @param stateEnum
	 * @param area
	 */
	public AreaExecution(AreaStateEnum stateEnum, Area area) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.area = area;
	}

	/**
	 * 成功的构造器
	 * @param stateEnum
	 * @param areaList
	 */
	public AreaExecution(AreaStateEnum stateEnum, List<Area> areaList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.areaList = areaList;
	}

}
