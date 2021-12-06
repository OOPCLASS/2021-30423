package com.company.models;

public class OutOfInkException extends RuntimeException {
    public OutOfInkException() {
    }

    public OutOfInkException(String errMsg) {
        super(errMsg);
    }
}
