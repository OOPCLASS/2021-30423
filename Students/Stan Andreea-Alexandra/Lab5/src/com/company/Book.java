package com.company;

import com.company.Product;

import java.util.Objects;

public class Book extends Entertainment{



    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getDescription() {
        return "The number of pages is "+String.valueOf(numberOfPages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPages);
    }
}
