package com.liuurick.o2o.service;

import com.liuurick.o2o.entity.ShopCategory;

import java.util.List;

/**
 * Created by liubin on 2020/7/14
 */
public interface ShopCategoryService {
    /**
     * 根据查询条件获取ShopCategory列表
     *
     * @param shopCategoryCondition
     * @return
     */
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
