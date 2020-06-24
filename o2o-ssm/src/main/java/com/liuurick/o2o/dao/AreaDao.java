package com.liuurick.o2o.dao;

import com.liuurick.o2o.entity.Area;

import java.util.List;

/**
 * Created by liubin on 2020/6/24
 */
public interface AreaDao {
    /**
     * 查询地区
     */
    List<Area> queryArea();
}
