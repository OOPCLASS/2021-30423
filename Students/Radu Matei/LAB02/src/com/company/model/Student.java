package com.company.model;

import java.util.Arrays;

public class Student {

    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;
    public CourseList courseList;

    public Student(){
        System.out.println("New student added:");
    }
    public Student(String uniqueIdentificationNumber, String lastName,String firstName, CourseList courseList){
        System.out.println("New student added.");
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdentificationNumber =uniqueIdentificationNumber;
        this.courseList = courseList;
        this.serialPrintStudent();
    }

    public String getFullName(){
        return this.lastName + " " + this.firstName;
    }

    public void serialPrintStudent(){
        System.out.println(this.uniqueIdentificationNumber + "  -  " + this.getFullName() + " " + Arrays.toString(courseList.listAllCourses()));
    }

}
