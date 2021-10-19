package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {

        StudentRegistry registry = new StudentRegistry();
        Course[] courses = new Course[10];

        Path fileName = Path.of("D:/OOP_labs/Lab3/src/com/company/courses.txt");

        List<String> fileContent = Files.readAllLines(fileName);
        int i = 0;
        for (String line : fileContent) {
            int j = 0;
            String[] lineWords = line.split(" ");
            String name = lineWords[j];
            j++;
            String creditsNumber = lineWords[j];
            j++;
            String numberOfRooms = lineWords[j];
            j++;
            int rooms[] = new int[10];
            for (int k = 0; k < Integer.parseInt(numberOfRooms); k++) {
                String x = lineWords[j];
                j++;
                rooms[k] = Integer.parseInt(x);
            }
            courses[i] = new Course(name, Integer.parseInt(creditsNumber), Integer.parseInt(numberOfRooms), rooms);
            i++;
        }

        Path fileName2 = Path.of("D:/OOP_labs/Lab3/src/com/company/students.txt");

        List<String> fileContent2 = Files.readAllLines(fileName2);

        for (String line : fileContent2) {
            int j = 0;
            String[] lineWords = line.split(" ");
            String uniqueIdentificationNumber = lineWords[j];
            j++;
            String firstName = lineWords[j];
            j++;
            String lastName = lineWords[j];
            j++;
            String n = lineWords[j];
            j++;
            Course[] studentsCourse = new Course[10];
            for (i = 0; i < Integer.parseInt(n); i++) {
                String x = lineWords[j];
                j++;
               studentsCourse[i] = courses[Integer.parseInt(x)];
            }
            registry.addStudent(uniqueIdentificationNumber, firstName, lastName, studentsCourse , Integer.parseInt(n));
        }

        for (i = 0; i < 10; i++) {
            System.out.println(registry.students[i].getFullName());
        }
    }
}
