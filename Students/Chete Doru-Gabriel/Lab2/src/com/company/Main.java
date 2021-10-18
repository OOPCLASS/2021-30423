package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path studentsFile = Path.of("C:\\Programming\\Lab2\\students.txt");
        Path coursesFile = Path.of("C:\\Programming\\Lab2\\courses.txt");
        List<String> studentsContent = Files.readAllLines(studentsFile);
        List<String> coursesContent = Files.readAllLines(coursesFile);
        StudentRegistry myRegistry = new StudentRegistry();
        for (String line : studentsContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            myRegistry.numberOfStudents ++;
            myRegistry.AddStudent(firstName, lastName);
        }
        Course[] myCourses = new Course[10];
        int numberOfCourses = 0;
        for (String line : coursesContent) {
            String[] lineWords = line.split(" ");
            String courseName = lineWords[0];
            int courseCredits = Integer.parseInt(lineWords[1]);
            int[] roomNumbers = new int[lineWords.length - 2];
            for(int j = 2; j < lineWords.length; j ++)
            {
                roomNumbers[j - 2] = Integer.parseInt(lineWords[j]);
            }
            myCourses[numberOfCourses] = new Course(courseName, courseCredits, roomNumbers);
            numberOfCourses ++;
        }

        for (Student i : myRegistry.students) {
            System.out.println(i.lastName);
        }

        for (Course k : myCourses) {
            System.out.println(k.courseName);
        }

    }
}
