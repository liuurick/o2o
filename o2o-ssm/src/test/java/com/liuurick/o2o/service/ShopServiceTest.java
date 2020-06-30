package com.liuurick.o2o.service;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.dto.ImageHolder;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.entity.ShopCategory;
import com.liuurick.o2o.enums.ShopStateEnum;
import com.liuurick.o2o.exceptions.ShopOperationException;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

import static org.junit.Assert.assertEquals;


/**
 * Created by liubin on 2020/6/28
 */
public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
   //@Ignore
    public void testAddShop() throws ShopOperationException, FileNotFoundException {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺1");
        shop.setShopDesc("test1");
        shop.setShopAddr("test1");
        shop.setPhone("test1");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        //C:\Users\admin\Desktop\work\imgs
        File shopImg = new File("C:/Users/admin/Desktop/work/imgs/wenhuacollege.jpg");
        ShopExecution se = shopService.addShop(shop, shopImg);

        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }

}
