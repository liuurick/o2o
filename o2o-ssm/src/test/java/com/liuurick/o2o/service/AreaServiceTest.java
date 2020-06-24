package com.liuurick.o2o.service;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.service.impl.AreaServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by liubin on 2020/6/24
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("7B",areaList.get(0).getAreaName());

    }
}
