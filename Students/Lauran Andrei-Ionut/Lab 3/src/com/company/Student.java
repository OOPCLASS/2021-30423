package com.company;

public class Student {
    String firstName;
    String lastName;
    String CNP;
    Course courses;

    public Student(String firstName, String lastName, String CNP, Course courses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;
        this.courses = courses;
    }

    void getStudentInfo(){
        System.out.println(firstName + " " + lastName + " " + CNP + " " + courses);
    }
}

