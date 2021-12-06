package com.company;

public class OutOfInkException extends RuntimeException {
    public OutOfInkException() {
    }

    public OutOfInkException(String message) {
        super(message);
    }
}
