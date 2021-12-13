package com.company.models;

public class Document {
    private String text;
    private Integer numberOfPages;

    public Document(String text, Integer numberOfPages) {
        this.text = text;
        this.numberOfPages = numberOfPages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
