import customClasses.Course;
import customClasses.StudentRegistry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentRegistry registry = new StudentRegistry();

        Path coursesFile = Path.of("resources/courses.txt");
        List<String> coursesContent = Files.readAllLines(coursesFile);
        Course[] courses = new Course[7];
        int numberOfCourses = 0;
        for (String line : coursesContent) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            int creditsNumber = Integer.parseInt(lineWords[1]);
            int[] roomNumbers = new int[lineWords.length - 2];
            for (int i = 2; i < lineWords.length; i++) {
                roomNumbers[i - 2] = Integer.parseInt(lineWords[i]);
            }
            courses[numberOfCourses] = new Course(name, creditsNumber, roomNumbers);
            numberOfCourses++;
        }

        Path studentFile = Path.of("resources/students.txt");
        List<String> studentContent = Files.readAllLines(studentFile);
        for (String line : studentContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            int uniqueIdentificationNumber = Integer.parseInt(lineWords[2]);
            Course[] attendedCourses = new Course[lineWords.length - 3];
            for (int i = 3; i < lineWords.length; i++) {
                attendedCourses[i - 3] = courses[Integer.parseInt(lineWords[i])];
            }
            registry.addStudent(firstName, lastName, uniqueIdentificationNumber, attendedCourses);
        }

        registry.printRegistry();
    }
}
