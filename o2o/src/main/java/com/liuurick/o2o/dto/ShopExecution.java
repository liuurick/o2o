package com.liuurick.o2o.dto;

import com.liuurick.o2o.entity.Shop;
import com.liuurick.o2o.enums.ShopStateEnum;
import lombok.Data;
import org.apache.commons.fileupload.util.LimitedInputStream;

import java.util.List;

/**
 * Created by liubin on 2021/2/8
 */
@Data
public class ShopExecution {
    /**
     * 结果状态
     */
    private int state;

    /**
     * 状态标识
     */
    private String stateInfo;

    /**
     * 店铺数量
     */
    private int count;

    /**
     * 操作的shop（增删改查用到）
     */
    private Shop shop;

    /**
     * shop列表（查询店铺列表）
     */
    private List<Shop> shopList;

    public ShopExecution() {
    }

    /**
     * shop操作失败
     * @param stateEnum
     */
    public ShopExecution(ShopStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /**
     * 店铺操作成功
     * @param stateEnum
     * @param shop
     */
    public ShopExecution(ShopStateEnum stateEnum, Shop shop) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }

    /**
     * 店铺操作成功的时候使用的构造器
     */
    public ShopExecution(ShopStateEnum stateEnum, List<Shop> shopList) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;
    }
}
