package com.liuurick.o2o.service;

import com.liuurick.o2o.dto.ImageHolder;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Shop;

import java.io.File;

/**
 * Created by liubin on 2020/6/28
 */
public interface ShopService {
    ShopExecution addShop(Shop shop,File shopImg);
    //ShopExecution addShop(Shop shop, ImageHolder thumbnail);
    //	ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;
}
