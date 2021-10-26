package com.studpack;

import com.studpack.classes.Student;
import com.studpack.classes.StudentRegistry;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        StudentRegistry registry = new StudentRegistry();
        registry.numberOfStudents = 10;
//        for (int i = 0; i < registry.numberOfStudents; i++) {
//            registry.students[i] = new Student();
//        }

        Path fileName = Path.of("F:\\_programming\\java\\student\\input\\input.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        int i = 0;
        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String uniqueID = lineWords[0];
            String firstName = lineWords[1];
            String lastName = lineWords[2];
            registry.students[i] = new Student(uniqueID, firstName, lastName);
            i++;
        }

        System.out.println(registry.students[2].firstName);
    }
}
