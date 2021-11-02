package com.company.model;

public class Book extends Product {

    private int year;
    private int numberOfPages;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getDescription() {
        return String.valueOf(numberOfPages);
    }
}