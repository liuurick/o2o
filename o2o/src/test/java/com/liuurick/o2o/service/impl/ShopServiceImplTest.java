package com.liuurick.o2o.service.impl;

import com.liuurick.o2o.BaseTest;
import com.liuurick.o2o.dao.ShopDao;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Area;
import com.liuurick.o2o.entity.PersonInfo;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.entity.ShopCategory;
import com.liuurick.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by liubin on 2021/2/8
 */
public class ShopServiceImplTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;

    @Test
    public void addShop() {
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        personInfo.setUserId(1L);
        shop.setOwner(personInfo);
        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setShopCategoryId(10L);
        shop.setShopCategory(shopCategory);

        Area area = new Area();
        area.setAreaId(4);
        shop.setArea(area);
        shop.setShopName("test");
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shopDao.insertShop(shop);

    }

    @Test
    public void modifyShop(){
        Shop shop = new Shop();
        shop.setShopId(40L);
        shop.setShopName("更新测试");
        shop.setEnableStatus(ShopStateEnum.PASS.getState());
        shopDao.updateShop(shop);
    }

}