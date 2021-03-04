package com.liuurick.o2o.exceptions;

/**
 * Created by liubin on 2021/2/8
 */
public class ShopOperationException extends RuntimeException{

    private static final long serialVersionUID = 2361446884822298905L;

    public ShopOperationException(String message) {
        super(message);
    }
}
