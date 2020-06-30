package com.liuurick.o2o.service.impl;

import com.liuurick.o2o.dao.ShopDao;
import com.liuurick.o2o.dto.ImageHolder;
import com.liuurick.o2o.dto.ShopExecution;
import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.enums.ShopStateEnum;
import com.liuurick.o2o.exceptions.ShopOperationException;
import com.liuurick.o2o.service.ShopService;
import com.liuurick.o2o.util.ImageUtil;
import com.liuurick.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;

/**
 * Created by liubin on 2020/6/28
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;



//    /**
//     * 添加店铺
//     * @param shop
//     * @param thumbnail
//     * @return
//     * @throws ShopOperationException
//     */
//    @Override
//    @Transactional
//    public ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException {
//        // 空值判断
//        if (shop == null) {
//            return new ShopExecution(ShopStateEnum.NULL_SHOP);
//        }
//        try {
//            // 给店铺信息赋初始值
//            shop.setEnableStatus(0);
//            shop.setCreateTime(new Date());
//            shop.setLastEditTime(new Date());
//            // 添加店铺信息
//            int effectedNum = shopDao.insertShop(shop);
//            if (effectedNum <= 0) {
//                throw new ShopOperationException("店铺创建失败");
//            } else {
//                if (thumbnail.getImage() != null) {
//                    // 存储图片
//                    try {
//                        addShopImg(shop, thumbnail);
//                    } catch (Exception e) {
//                        throw new ShopOperationException("addShopImg error:" + e.getMessage());
//                    }
//                    // 更新店铺的图片地址
//                    effectedNum = shopDao.updateShop(shop);
//                    if (effectedNum <= 0) {
//                        throw new ShopOperationException("更新图片地址失败");
//                    }
//                }
//            }
//        } catch (Exception e) {
//            throw new ShopOperationException("addShop error:" + e.getMessage());
//        }
//        return new ShopExecution(ShopStateEnum.CHECK, shop);
//    }

    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, File shopImg) {
        if (shop == null){
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            shop.setEnableStatus(1);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());

            int effectedNum = shopDao.insertShop(shop);
            if (effectedNum <= 0){
                throw new ShopOperationException("店铺创建失败");
            }else {
                if (shopImg != null){
                    //存储图片
                    try {
                        addShopImg(shop,shopImg);
                    }catch (Exception e){
                        throw new ShopOperationException("addShopImg error:"+e.getMessage());
                    }
                    //更新店铺图片地址
                    effectedNum = shopDao.updateShop(shop);
                    if (effectedNum <= 0){
                        throw new ShopOperationException("更新图片地址失败");
                    }
                }
            }
        }catch (Exception e){
            throw new ShopOperationException("addShop error:" + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK,shop);
    }

    /**
     * 添加店铺图片
     * @param shop
     * @param thumbnail
     */
    private void addShopImg(Shop shop, File shopImg) {
        // 获取shop图片目录的相对值路径
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
        shop.setShopImg(shopImgAddr);
    }


}
