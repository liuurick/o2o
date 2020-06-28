package com.liuurick.o2o.dao;

import com.liuurick.o2o.entity.Shop;

/**
 * Created by liubin on 2020/6/27
 */
public interface ShopDao {
   /**
    * 插入店铺
    * @param shop
    * @return
    */
   int insertShop(Shop shop);

   int updateShop(Shop shop);
}
