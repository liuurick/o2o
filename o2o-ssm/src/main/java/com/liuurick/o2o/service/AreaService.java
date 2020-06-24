package com.liuurick.o2o.service;

import com.liuurick.o2o.entity.Area;

import java.util.List;

/**
 * Created by liubin on 2020/6/24
 */
public interface AreaService {
    /**
     * 获取区域列表，优先从缓存获取
     *
     * @return
     */
    List<Area> getAreaList();

}
