package com.liuurick.o2o.dao;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by liubin on 2020/6/27
 */

public class ShopDaoTest extends BaseTest {

    @Autowired
    ShopDao shopDao;

    @Test
    public void testAddShop(){
        PersonInfo user = new PersonInfo();
        ShopCategory sc = new ShopCategory();
        Area area = new Area();
        Shop shop = new Shop();
        sc.setShopCategoryId(1L);
        area.setAreaId(1);
        user.setUserId(1L);

        shop.setOwner(user);
        shop.setArea(area);
        shop.setShopCategory(sc);
        shop.setAdvice("test");
        shop.setEnableStatus(1);
        shop.setPhone("test");
        shop.setShopName("喜茶");
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);
    }


    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setPhone("13125315316");
        shop.setAdvice("312412");
        shop.setShopName("1111喜茶");
        shop.setLastEditTime(new Date());

        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1, effectedNum);
    }
}
