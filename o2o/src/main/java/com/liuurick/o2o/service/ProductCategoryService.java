package com.liuurick.o2o.service;

import com.liuurick.o2o.dto.ProductCategoryExecution;
import com.liuurick.o2o.entity.ProductCategory;
import com.liuurick.o2o.exceptions.ProductCategoryOperationException;

import java.util.List;

/**
 * Created by liubin on 2021/2/13
 */
public interface ProductCategoryService {
    /**
     * 查询指定某个店铺下的所有商品类别信息
     *
     * @param long
     *            shopId
     * @return List<ProductCategory>
     */
    List<ProductCategory> getProductCategoryList(long shopId);

    /**
     *
     * @param productCategory
     * @return
     * @throws ProductCategoryOperationException
     */
    ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
            throws ProductCategoryOperationException;

    /**
     * 将此类别下的商品里的类别id置为空，再删除掉该商品类别
     * @param productCategoryId
     * @param shopId
     * @return
     * @throws RuntimeException
     */
    ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId)
            throws ProductCategoryOperationException;
}
