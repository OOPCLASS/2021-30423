package com.company;

public class Document{
    private String text;
    private int numberOfPages;

    public Document(String text, int numberOfPages){
        this.text=text;
        this.numberOfPages=numberOfPages;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
