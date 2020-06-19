package com.nikolairudko.basket.exception;

public class BasketException extends Exception {
    public BasketException() {
        super();
    }

    public BasketException(String message) {
        super(message);
    }

    public BasketException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketException(Throwable cause) {
        super(cause);
    }
}