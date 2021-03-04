package com.liuurick.o2o.service;

import com.liuurick.o2o.dto.ImageHolder;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Shop;


/**
 * Created by liubin on 2021/2/8
 */
public interface ShopService {

    /**
     * 店铺添加
     * @param shop
     * @param shopImg
     * @return
     */
    ShopExecution addShop(Shop shop, ImageHolder shopImg);

    /**
     * 店铺修改
     * @param shop
     * @param shopImg
     * @return
     */
    ShopExecution modifyShop(Shop shop,ImageHolder shopImg);

    /**
     * 获取店铺信息
     * @param shopId
     * @return
     */
    Shop getByShopId(Long shopId);

    /**
     * 获取店铺列表
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}
