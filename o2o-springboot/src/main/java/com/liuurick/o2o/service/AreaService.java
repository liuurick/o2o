package com.liuurick.o2o.service;

import java.util.List;

import com.liuurick.o2o.dto.AreaExecution;
import com.liuurick.o2o.entity.Area;

public interface AreaService {
	public static final String AREALISTKEY = "arealist";

	/**
	 * 获取区域列表，优先从缓存获取
	 * 
	 * @return
	 */
	List<Area> getAreaList();

	/**
	 * 增加区域信息
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution addArea(Area area);

	/**
	 * 修改区域信息
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution modifyArea(Area area);

}
