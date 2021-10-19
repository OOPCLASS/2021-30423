package com.company;

/*
 * Create a StudentRegistry which holds an array of Student(s). Initialize the array
 * with at least 10 instances (random values for the attributes). Every student
 * could have one or more Course(s) which he/she attends. For each Course we should
 * store the name, creditsNumber and an array of roomNumbers
 * <p>
 * 1. Try to read student info from a file students.txt
 * 2. Try to read courses info from a file courses.txt
 * 3. Add a method in StudentRegistry which adds a Student to the array inside StudentRegistry
 *
 *  BufferedReader fileCourses = new BufferedReader(new FileReader("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\courses.txt"));
        BufferedReader fileStudents = new BufferedReader(new FileReader("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\students.txt"));
        Student[] students = new Student[(int) fileStudents.lines().count()];
        Course[] courses = new Course[(int) fileCourses.lines().count()];
        int size = students.length;
        StudentRegistery studentRegistery = new StudentRegistery(students, size);

        int nrOfCourse = 0;
        String line = fileCourses.readLine();
        System.out.println(line);
        while (line != null) {
            String[] words = line.split(" ");
            int[] roomNumbers = new int[words.length - 2];
            int credits = Integer.parseInt(words[1]);
            int j = 0;
            for(int i = 2; i < words.length; i++) {
                roomNumbers[j] = Integer.parseInt(words[i]);
                j++;
            }
            courses[nrOfCourse] = new Course(words[0],credits,roomNumbers);
            nrOfCourse++;
            line = fileCourses.readLine();
        }
        for(int i = 0; i < nrOfCourse; i++) {
            System.out.println(courses[i].name);
 */

import ro.utcluj.model.Course;
import ro.utcluj.model.Student;
import ro.utcluj.model.StudentRegistery;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader fileCourses = new BufferedReader(new FileReader("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\courses.txt"));
        BufferedReader fileStudents = new BufferedReader(new FileReader("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\students.txt"));

        Student[] students = new Student[(int) fileStudents.lines().count()];
        Course[] courses = new Course[(int) fileCourses.lines().count()];

        int size = students.length;

        int nrOfCourse = 0;
        Scanner scannerCourses = new Scanner(new File("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\courses.txt"));
        while (scannerCourses.hasNextLine()) {
            String line = scannerCourses.nextLine();
            String[] words = line.split(" ");
            int[] roomNumbers = new int[words.length - 2];
            int credits = Integer.parseInt(words[1]);
            int j = 0;

            for (int i = 2; i < words.length; i++) {
                roomNumbers[j] = Integer.parseInt(words[i]);
                j++;
            }

            courses[nrOfCourse] = new Course(words[0], credits, roomNumbers);
            nrOfCourse++;
        }

        int nrOfStudents = 0;
        Scanner scannerStudents = new Scanner(new File("C:\\Users\\mosh_\\Desktop\\cursuri\\anul2\\oop\\Labs\\Lab03\\src\\students.txt"));
        while (scannerStudents.hasNextLine()) {
            String line = scannerStudents.nextLine();
            String[] words = line.split(" ");
            String uniqueIdentificationNumber = words[0];
            String firstName = words[1];
            String lastName = words[2];
            Course[] studentCourses = new Course[words.length - 3];
            int j = 0;
            for (int i = 3; i < words.length - 3; i++) {
                for (int k = 0; k < courses.length; k++) {
                    if (words[i] == courses[k].name) {
                        studentCourses[j] = courses[k];
                        j++;
                    }
                }
            }

            students[nrOfStudents] = new Student(uniqueIdentificationNumber, firstName, lastName, studentCourses);
            nrOfStudents++;
        }

        for (int i = 0; i < nrOfCourse; i++) {
            System.out.println(courses[i].name);
        }

        for (int i = 0; i < nrOfStudents; i++) {
            System.out.println(students[i].getFullName());
        }

        StudentRegistery studentRegistery = new StudentRegistery(students, size);
        System.out.println();
        studentRegistery.printStudents();
        System.out.println();
        int[] test = {1, 2, 3};
        Course[] testCourse = new Course[1];
        testCourse[0] = new Course("Vrajeala", 99, test);
        Student testStudent = new Student("3", "Bob", "Ita", testCourse);
        studentRegistery.addStudent(testStudent);
        studentRegistery.printStudents();
    }
}
