package ro.utcluj.model;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentRegistery {
    public int size;
    public Student[] student;
    public ArrayList<Student> studentsRegistery;

    public void addStudent(Student studentToBeAdded) {
        studentsRegistery.add(studentToBeAdded);
        size++;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(studentsRegistery.get(i).getFullName());
        }
    }

    public StudentRegistery(Student[] students, int size) {
        this.student = students;
        this.size = size;
        this.studentsRegistery = new ArrayList<Student>(Arrays.asList(this.student));
    }

}
