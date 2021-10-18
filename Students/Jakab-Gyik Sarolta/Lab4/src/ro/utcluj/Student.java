package ro.utcluj;

import java.util.ArrayList;

public class Student {
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;
    public ArrayList<Integer> grades;
    public ArrayList<Courses> courses = new ArrayList<>();

    public Student(String firstName, String lastName, String uniqueIdentificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(Integer grades) {
        this.grades.add(grades);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAverage() {
        int sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum += this.grades.get(i);
        }
        return sum / this.grades.size();
    }

    public void getCourse(Courses courseName) {
        this.courses.add(courseName);
    }

    public void printCourses() {
        for (int i = 0; i < this.courses.size(); i++) {
            System.out.print(this.courses.get(i).name + " ");
        }
    }
}
