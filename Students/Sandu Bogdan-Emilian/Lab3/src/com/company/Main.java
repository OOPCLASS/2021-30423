package com.company;

import java.io.*;
import java.rmi.registry.Registry;
import java.util.Objects;
import java.util.Scanner;

import com.company.model.Course;
import com.company.model.Student;
import com.company.model.StudentRegistry;
/**
 * Create a StudentRegistry which holds an array of Student(s). Initialize the array
 * with at least 10 instances (random values for the attributes). Every student
 * could have one or more Course(s) which he/she attends. For each Course we should
 * store the name, creditsNumber and an array of roomNumbers
 * <p>
 * 1. Try to read student info from a file students.txt
 * 2. Try to read courses info from a file courses.txt
 * 3. Add a method in StudentRegistry which adds a Student to the array inside StudentRegistry
 */

public class Main {
    public static void main(String[] args) {
        Course[] Courses = new Course[10];
        Student[] Students = new Student[10];
        try {
            File courses = new File("C:\\Users\\sandu\\OOP_Labs\\Lab3\\src\\com\\company\\courses.txt");
            int lines = 0;
            LineNumberReader lnr = new LineNumberReader(new FileReader(courses));
            while (lnr.readLine() != null) {
                lines = lnr.getLineNumber();
            }
            Courses = new Course[lines];
            Scanner myReader = new Scanner(courses);
            int k = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] words = line.split(" ");
                String courseName = words[0];
                int[] roomNumbers = new int[words.length - 2];
                int j = 0;
                int creditsNumber = Integer.parseInt(words[1]);
                for (int i = 2; i < words.length; i++) {
                    roomNumbers[j] = Integer.parseInt(words[i]);
                    j++;
                }
                Courses[k] = new Course(courseName, creditsNumber, roomNumbers);
                k++;
            }
            for( int i = 0; i < lines; i++){
                System.out.print(Courses[i].courseName);
                System.out.print(" ");
                System.out.print(Courses[i].creditsNumber);
                System.out.println();
            }
        } catch (FileNotFoundException error) {
            System.out.println("error");
            error.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File students = new File("C:\\Users\\sandu\\OOP_Labs\\Lab3\\src\\com\\company\\students.txt");
            int lines = 0;
            LineNumberReader lnr = new LineNumberReader(new FileReader(students));
            while (lnr.readLine() != null) {
                lines = lnr.getLineNumber();
            }
            Students = new Student[lines];
            Scanner myReader = new Scanner(students);
            int k = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] words = line.split(" ");
                String firstName = words[0];
                String lastName = words[1];
                String id = words[2];
                String [] courseName = new String[words.length - 3];
                int j = 0;
                for (int i = 3; i < words.length; i++) {
                    System.out.println(words[i]);
                    courseName[j] = words[i];
                    j++;
                }
                Course[] studentCourse = new Course[courseName.length];
                for(int i = 0; i < courseName.length; i++){
                    for(int l = 0; l < Courses.length; l++){
                        if(Objects.equals(Courses[l].courseName, courseName[i])){
                            studentCourse[i] = Courses[l];
                        }
                    }
                }
                Students[k] = new Student(firstName,lastName,id,studentCourse);
                k++;
            }
        } catch (FileNotFoundException error) {
            System.out.println("error");
            error.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int [] roomNumbers = {2,3};
        Course [] testCourse = new Course[1];
        testCourse[0] = new Course("test", 123, roomNumbers);
        Student testStudent = new Student("bogdan", "sandu", "123",testCourse);
        StudentRegistry Registry = new StudentRegistry();
/*        Registry.addStudent(testStudent);
        Registry.printStudents();
        Registry.addStudent(testStudent);
        Registry.printStudents();
        System.out.println("");*/
        for(int i = 0; i < Students.length; i++){
            Registry.addStudent(Students[i]);
            System.out.println(Students[i].firstName);
            System.out.println(Students[i].lastName);
            System.out.println(Students[i].courses[0].courseName);
            System.out.println("---");
        }
        System.out.println("--------");
        Registry.printStudents();
    }
}
