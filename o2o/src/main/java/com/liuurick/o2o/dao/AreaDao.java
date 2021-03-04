package com.liuurick.o2o.dao;

import com.liuurick.o2o.entity.Area;

import java.util.List;

/**
 * Created by liubin on 2020/6/24
 */
public interface AreaDao {

    /**
     * 列出所有区域
     * @return
     */
    List<Area> queryArea();

    /**
     * 插入区域
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(long areaId);

    /**
     * 批量删除区域
     * @param areaIdList
     * @return
     */
    int batchDeleteArea(List<Long> areaIdList);


}
