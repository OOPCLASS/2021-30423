package com.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Music extends Product{
    private String genre;
    private String[] bandMembers;

    public Music(String genre, String[] bandMembers) {
        this.genre = genre;
        this.bandMembers = bandMembers;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(String[] bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(genre, music.genre) && Arrays.equals(bandMembers, music.bandMembers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(genre);
        result = 31 * result + Arrays.hashCode(bandMembers);
        return result;
    }
}
