package com.company;

public class OutOfInkException extends RuntimeException{
    public OutOfInkException(String message){
        super(message);
    }
}
