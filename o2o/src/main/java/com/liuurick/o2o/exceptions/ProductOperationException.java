package com.liuurick.o2o.exceptions;

/**
 * Created by liubin on 2021/2/13
 */
public class ProductOperationException extends RuntimeException{
    private static final long serialVersionUID = 5076172298827469013L;

    public ProductOperationException(String msg) {
        super(msg);
    }
}
