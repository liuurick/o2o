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

   /**
    * 更新店铺信息
    * @param shop
    * @return
    */
   int updateShop(Shop shop);
}
