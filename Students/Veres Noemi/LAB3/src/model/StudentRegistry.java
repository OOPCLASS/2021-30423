package model;

public class StudentRegistry {
    public Student[] students;

    int noOfStudents = 0;
    public void addStudent(Student newStudent) {
        this.students[noOfStudents] = newStudent;
        noOfStudents++;
    }
}
