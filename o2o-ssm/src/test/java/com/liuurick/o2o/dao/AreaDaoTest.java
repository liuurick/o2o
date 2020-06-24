package com.liuurick.o2o.dao;


import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liubin on 2020/6/24
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        for(Area areas : areaList){
            System.out.println(areas);
        }
    }
}
