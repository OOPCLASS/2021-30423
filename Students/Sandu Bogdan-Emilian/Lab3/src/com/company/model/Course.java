package com.company.model;

public class Course {
    public String courseName;
    public int creditsNumber;
    public int [] roomNumbers = new int[10];

    public Course(String courseName, int creditsNumber, int [] roomNumbers){
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
        System.arraycopy(roomNumbers, 0, this.roomNumbers, 0, roomNumbers.length);
    }
}
