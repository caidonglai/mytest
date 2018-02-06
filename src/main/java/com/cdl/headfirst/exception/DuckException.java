package com.cdl.headfirst.exception;

public class DuckException extends RuntimeException {

    public DuckException(String message) {
        super(message);
    }

    public DuckException(String message, Throwable e) {
        super(message, e);
    }

}
