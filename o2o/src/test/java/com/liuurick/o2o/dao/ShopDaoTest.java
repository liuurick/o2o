package com.liuurick.o2o.dao;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.provider.SHA;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by liubin on 2021/1/31
 */
public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void insertShop() {
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        ShopCategory shopCategory = new ShopCategory();
        Area area = new Area();

        area.setAreaId(2);
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(10L);

        shop.setOwner(personInfo);
        shop.setShopCategory(shopCategory);
        shop.setPhone("12345678");
        shop.setEnableStatus(1);
        shop.setCreateTime(new Date());
        shop.setShopName("liubin");
        shop.setPriority(111);
        shop.setArea(area);
        shopDao.insertShop(shop);

    }

    @Test
    public void updateShop() {
        Shop shop = new Shop();
        shop.setShopId(38L);
        shop.setShopName("刘斌");
        shopDao.updateShop(shop);
    }

    @Test
    public void queryByShopId() {
        Shop shop = shopDao.queryByShopId(38);
        System.out.println(shop);
    }
}