package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public String courseName;
    public int creditsNumber;
    public List<Integer> roomNumbers= new ArrayList<Integer>();

    public Course(){

    }

    public Course(String courseName, int creditsNumber, List<Integer> roomNumbers){
        System.out.println("New course added.");
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
        this.roomNumbers = roomNumbers;
        this.serialPrintCourse();
    }

    public void serialPrintCourse(){
        System.out.println(this.courseName + " " + this.creditsNumber + " " + this.roomNumbers.toString());
    }

}
