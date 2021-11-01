package com.company;

import java.util.Objects;

public class Entertainment extends Product{
    private int year;
    private Double rating;

    public Entertainment(){

    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entertainment)) return false;
        if (!super.equals(o)) return false;
        Entertainment that = (Entertainment) o;
        return year == that.year && rating.equals(that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, rating);
    }
}
