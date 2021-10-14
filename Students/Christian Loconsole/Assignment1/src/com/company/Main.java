package com.company;

import Model.Student;
import Model.StudentRegistry;

import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Student[] students = new Student[10];

        Student student1 = new Student("A", "1", "001");
        Student student2 = new Student("B", "2", "002");
        Student student3 = new Student("C", "3", "003");
        Student student4 = new Student("D", "4", "004");
        Student student5 = new Student("E", "5", "005");
        Student student6 = new Student("F", "6", "006");
        Student student7 = new Student("Easter","Egg","777");
        Student student8 = new Student("G", "7", "007");
        Student student9 = new Student();
        Student student10 = new Student("H", "8", "008");

        StudentRegistry registry = new StudentRegistry("registry1", students);

        registry.addStudent(student1, 0);
        registry.addStudent(student2, 6);
        registry.addStudent(student3, 2);
        registry.addStudent(student4, 3);
        registry.addStudent(student5, 4);
        registry.addStudent(student6, 5);
        registry.addStudent(student7, 1);
        registry.addStudent(student8, 7);
        registry.addStudent(student9, 8);
        registry.addStudent(student10, 9);

        registry.showArrayOfStudents();


        // They way of reading files you showed us gave me troubles with finding the path so I found this on the internet

        try {
            File file = new File("C:\\Users\\c.loconsole3\\Desktop\\Studio Cluj\\OOP\\AssignmentOOP\\2021-30423\\Students\\Christian Loconsole\\Assignment1\\src\\Files\\students.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                String line= input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
