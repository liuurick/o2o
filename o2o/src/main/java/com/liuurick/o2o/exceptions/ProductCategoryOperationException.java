package com.liuurick.o2o.exceptions;

/**
 * Created by liubin on 2021/2/13
 */
public class ProductCategoryOperationException extends RuntimeException{

    private static final long serialVersionUID = 1182563719599527969L;

    public ProductCategoryOperationException(String msg) {
        super(msg);
    }
}
