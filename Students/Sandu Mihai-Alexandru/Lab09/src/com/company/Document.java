package com.company;

public class Document {
    private String text;
    private Integer nrOfPages;


    public Document(String text, Integer nrOfPages) {
        this.text = text;
        this.nrOfPages = nrOfPages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(Integer nrOfPages) {
        this.nrOfPages = nrOfPages;
    }
}
