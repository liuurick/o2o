package com.liuurick.o2o.dao;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liubin on 2021/1/31
 */
public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        System.out.println(areaList);
    }

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        for (Area area:areaList) {
            System.out.println(area.getAreaName());
        }
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("7b");
        area.setPriority(100);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());

        areaDao.insertArea(area);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(5);
        area.setAreaName("7B");

        areaDao.updateArea(area);
    }

    @Test
    public void deleteArea() {
        areaDao.deleteArea(5);
    }

    @Test
    public void batchDeleteArea() {
    }
}