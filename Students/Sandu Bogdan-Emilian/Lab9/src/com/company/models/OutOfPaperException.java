package com.company.models;

import java.io.IOException;

public class OutOfPaperException extends IOException {
    public OutOfPaperException() {
    }

    public OutOfPaperException(String errMsg) {
        super(errMsg);
    }
}
