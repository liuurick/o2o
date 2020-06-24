package com.liuurick.o2o.service.impl;

import com.liuurick.o2o.dao.AreaDao;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liubin on 2020/6/24
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
