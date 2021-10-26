package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Student firstStudent = new Student("123","Noemi", 'D',
                "Veres", "veres@yahoo.com", "0723466182",
                "Computer Science",true , 8.65, 9.15);
        firstStudent.uniqueIdentificationNumber = "123";
        firstStudent.firstName = "Noemi";
        firstStudent.lastName = "Veres";
        //System.out.println(firstStudent.firstName + " " + firstStudent.lastName);

        Student secondStudent = new Student();
        secondStudent.uniqueIdentificationNumber = "456";
        secondStudent.firstName = "Ion";
        secondStudent.lastName = "Moraru";
        System.out.println(secondStudent.getFullName());*/

        StudentRegistry TURegistry = new StudentRegistry();

        Path fileStudents = Path.of("C:\\Users\\veres\\IdeaProjects\\LAB#\\src\\model\\students.txt");
        List<String> studentContent = Files.readAllLines(fileStudents);

        Student[] TUStudents = new Student[10];
        int noOfStudents = 0;
        for (String line : studentContent) {
            String[] lineWords = line.split(" ");
            String uniqueIdentificationNumber = lineWords[0];
            String firstName = lineWords[1];
            char fathersInitial = lineWords[2].charAt(0);
            String lastName = lineWords[3];
            String emailAddress = lineWords[4];
            String phoneNumber = lineWords[5];
            String department = lineWords[6];
            boolean scholarship = Boolean.parseBoolean(lineWords[7]);
            double average = Double.parseDouble(lineWords[8]);
            double lastYearAverage = Double.parseDouble(lineWords[9]);
            TUStudents[noOfStudents] = new Student(uniqueIdentificationNumber, firstName, fathersInitial,
            lastName, emailAddress, phoneNumber, department, scholarship, average, lastYearAverage);
            noOfStudents++;
        }

        Path fileCourses = Path.of("C:\\Users\\veres\\IdeaProjects\\LAB#\\src\\model\\courses.txt");
        List<String> courseContent = Files.readAllLines(fileCourses);

        Course[] TUCourses = new Course[6];
        int noOfCourses = 0;
        for (String line : courseContent) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            int creditsNumber = Integer.parseInt(lineWords[1]);
            String[] roomNumbers = new String[3];
            roomNumbers[0] = lineWords[2];
            roomNumbers[1] = lineWords[3];
            roomNumbers[2] = lineWords[4];
            TUCourses[noOfCourses] = new Course(name,creditsNumber,roomNumbers);
            noOfCourses++;
        }
        //System.out.println(TUCourses[4].name);
    }
}
