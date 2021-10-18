package com.company;

public class StudentRegistry {
    public int numberOfStudents = 0;
    public Student[] students = new Student[20];

    public StudentRegistry(){
        this.numberOfStudents += 10;
        students[0] = new Student("Jimmy", "Rogers", 1);
        students[1] = new Student("Paul", "Conelly", 2);
        students[2] = new Student("Richard", "Bond", 3);
        students[3] = new Student("William", "McDonald", 4);
        students[4] = new Student("Heather", "Rooney", 5);
        students[5] = new Student("Lilly", "Jones",6);
        students[6] = new Student("Otis", "Jones",7);
        students[7] = new Student("Thomas", "Ronson",8);
        students[8] = new Student("Ada", "King",9);
        students[9] = new Student("Jane", "Clarkson",10);

    }

    public void AddStudent(String firstName, String lastName)
    {
        students[numberOfStudents - 1] = new Student(firstName, lastName, this.numberOfStudents);
    }




}
