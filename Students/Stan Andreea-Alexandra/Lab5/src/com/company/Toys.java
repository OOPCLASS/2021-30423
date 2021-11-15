package com.company;

import java.util.Objects;

public class Toys extends Product{
    private int minAge;
    private String type;



    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //overload
    public void check(int age){
        if(age<this.minAge)
        System.out.println("Not ok");
        else System.out.println("ok");
    }

    public void check(Double price){
        if(price>100.0)
            System.out.println("too expensive");
        else System.out.println("it can be bought");
    }

    @Override
    public String getDescription() {
        return "it is a " +type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toys toys)) return false;
        if (!super.equals(o)) return false;
        return minAge == toys.minAge && type.equals(toys.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minAge, type);
    }
}
