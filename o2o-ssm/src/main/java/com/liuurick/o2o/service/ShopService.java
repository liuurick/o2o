package com.liuurick.o2o.service;

import com.liuurick.o2o.dto.ImageHolder;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.exceptions.ShopOperationException;

import java.io.File;

/**
 * Created by liubin on 2020/6/28
 */
public interface ShopService {

    /**
     * 添加店铺
     * @param shop
     * @param thumbnail
     * @return
     * @throws ShopOperationException
     */
    ShopExecution addShop(Shop shop,ImageHolder thumbnail) throws ShopOperationException;


    /**
     * 更新店铺信息，包括对图片的处理
     *
     * @param shop
     * @param
     * @return
     * @throws ShopOperationException
     */
    ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

    /**
     * 通过店铺Id获取店铺信息
     *
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);
}
