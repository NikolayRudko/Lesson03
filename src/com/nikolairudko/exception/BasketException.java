package com.nikolairudko.exception;

public class BasketException extends Exception {
    public BasketException() {
        super();
    }

    public BasketException(String message) {
        super(message);
    }

    public BasketException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BasketException(Throwable throwable) {
        super(throwable);
    }
}