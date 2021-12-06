package com.company;

public class OutOfPaperException extends Exception {

    public OutOfPaperException(String errorMessage) {
        super(errorMessage);
    }
}
