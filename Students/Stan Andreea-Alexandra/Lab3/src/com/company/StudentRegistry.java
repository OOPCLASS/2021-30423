package com.company;

public class StudentRegistry {
    public Student[] students;
    public int numberOfStudents;

    public StudentRegistry(){
        students=new Student[100];
        numberOfStudents=0;
    }

    public void addStudent(String uniqueIdentificationNumber, String firstName, String lastName, Course[] courses,int numberOfCOurses)
    {
        students[numberOfStudents]=new Student(uniqueIdentificationNumber,firstName, lastName, courses,numberOfCOurses);
        numberOfStudents++;
    }

}
