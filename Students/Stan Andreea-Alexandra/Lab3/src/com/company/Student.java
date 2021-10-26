package com.company;

public class Student {
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;
    public Course[] courses;
    public int numberOfCourses;

    public Student(String uniqueIdentificationNumber, String firstName, String lastName, Course[] courses,int numberOfCourses){
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses= courses;
        this.numberOfCourses=numberOfCourses;

    }

    public String getFullName(){

        return firstName+ " "+lastName+" "+uniqueIdentificationNumber+"\n";
    }
}
