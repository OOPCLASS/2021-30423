package com.company;

public class Course {
    public String name;
    public int creditsNumber;
    public int[] roomNumbers;
    public int numberOfRooms;

    public Course(String name, int creditsNumber, int numberOfRooms,int[] roomNumbers){
        this.name = name;
        this.creditsNumber = creditsNumber;
        this.roomNumbers = roomNumbers;
        this.numberOfRooms=numberOfRooms;

    }
}
