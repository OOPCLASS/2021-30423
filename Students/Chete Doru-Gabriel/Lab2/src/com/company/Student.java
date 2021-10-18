package com.company;

public class Student {
    public String firstName = "";
    public String lastName = "";
    public int studentID;
    public Course[] courses = new Course[10];

    public Student(String firstName, String lastName, int studentID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }
}
