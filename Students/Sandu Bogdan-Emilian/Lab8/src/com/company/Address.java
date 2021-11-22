package com.company;

public class Address {
    private String Country;
    private String Town;
    private String street;
    private int number;

    public Address(String country, String town, String street, int number) {
        Country = country;
        Town = town;
        this.street = street;
        this.number = number;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
