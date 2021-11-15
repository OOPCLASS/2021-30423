package com.company;


import java.util.Objects;

public class Movie extends Entertainment {

    private int lengthInMinutes;


    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }



    @Override
    public String getDescription() {
        return "The durations is: "+String.valueOf(lengthInMinutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return lengthInMinutes == movie.lengthInMinutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthInMinutes);
    }
}
