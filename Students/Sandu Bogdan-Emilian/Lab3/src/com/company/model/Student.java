package com.company.model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.company.model.Course;


public class Student {
    public String firstName;
    public String lastName;
    public String uniqueIdentificationNumber;
    public Course[] courses = new Course[10];

    File myObj = new File("students.txt");


    public Student ( String FirstName, String LastName, String UniqueIdentificationNumber, Course [] Courses){
        this.firstName = FirstName;
        this.lastName = LastName;
        this.uniqueIdentificationNumber = UniqueIdentificationNumber;
        System.arraycopy(Courses, 0, courses, 0, Courses.length);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}


