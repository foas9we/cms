package com.briup.apps.util;

public class CustomerException extends RuntimeException {
    public CustomerException(){

    }

    public CustomerException(String message){
        super(message);
    }

    public CustomerException(String message,Throwable course){
        super(message,course);
    }

    public CustomerException(Throwable course){
        super((course));
    }

    public CustomerException(String message,Throwable course,Boolean enableSuppression,Boolean writableStackTrace){
        super(message,course,enableSuppression,writableStackTrace);
    }
}
