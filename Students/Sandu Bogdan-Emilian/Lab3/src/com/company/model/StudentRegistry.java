package com.company.model;

import com.company.model.Student;
import com.company.model.Course;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {
    public List<Student> Students = new ArrayList<Student>();
    public int numberOfStudents = 0;

    public void addStudent(Student studentToBeAdded) {
        this.Students.add(studentToBeAdded);
        this.numberOfStudents++;
    }

    public void printStudents() {
        for (Student student : Students) System.out.println(student.firstName);
    }

    Course[] course = new Course[1];
}
