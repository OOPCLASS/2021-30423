package ro.utcluj;

import java.util.Scanner; // Import the Scanner class to read text files
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.StringTokenizer;

/**
 * Create a StudentRegistry which holds an array of Student(s). Initialize the array
 * with at least 10 instances (random values for the attributes). Every student
 * could have one or more Course(s) which he/she attends. For each Course we should
 * store the name, creditsNumber and an array of roomNumbers
 *
 * 1. Try to read student info from a file students.txt
 * 2. Try to read courses info from a file courses.txt
 * 3. Add a method in StudentRegistry which adds a Student to the array inside StudentRegistry
 */
public class Main {

    public static void main(String[] args) {
        StudentRegistry newStudentRegistry = new StudentRegistry();
        try {
            File myObj = new File("C:\\OOP_LABS\\Lab4\\src\\ro\\utcluj\\students.txt");

            Scanner myReader = new Scanner(myObj);

            String uniqueIdentificationNumber;
            String firstName;
            String lastName;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                StringTokenizer newTokenizer = new StringTokenizer(data, " ");
                uniqueIdentificationNumber = newTokenizer.nextToken();
                firstName = newTokenizer.nextToken();
                lastName = newTokenizer.nextToken();

                Student newStudent = new Student(firstName, lastName, uniqueIdentificationNumber);

                while (newTokenizer.hasMoreTokens()) {
                    newStudent.addGrade(Integer.parseInt(newTokenizer.nextToken()));
                }

                newStudentRegistry.insertNewStudent(newStudent);
                /**System.out.println(newStudent.firstName);
                 for (int i = 0; i < grades.size(); i++) {
                 System.out.println(grades.get(i));
                 }*/
            }
            newStudentRegistry.getRegistry();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            File mySecondObj = new File("C:\\OOP_LABS\\Lab4\\src\\ro\\utcluj\\courses.txt");
            Scanner mySecondReader = new Scanner(mySecondObj);
            String courseName;
            int creditsNumber;
            while (mySecondReader.hasNextLine()) {
                String data = mySecondReader.nextLine();
                StringTokenizer newTokenizer = new StringTokenizer(data, " ");
                courseName = newTokenizer.nextToken();
                creditsNumber = Integer.parseInt(newTokenizer.nextToken());
                Courses newCourse = new Courses(courseName, creditsNumber);
                while (newTokenizer.hasMoreTokens()) {
                    newCourse.addRoomNumbers(Integer.parseInt(newTokenizer.nextToken()));
                }
                newCourse.listCourse();
                newStudentRegistry.myClass.get(0).getCourse(newCourse);
            }
            mySecondReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();
        newStudentRegistry.myClass.get(0).printCourses();
        /**int[] grades = {1, 2, 4, 5};
         int[] grades1 = {10, 8, 4, 6};
         Student firstStudent = new Student("Kate", "Styles", "098", grades);
         Student secondStudent = new Student("Sam", "Willow", "2746433", grades1);
         firstStudent.getFullName();
         secondStudent.getFullName();
         System.out.println(firstStudent.getAverage());
         System.out.println(secondStudent.getAverage());

         int[] roomNumbers = {12, 13, 44, 56};
         Courses javaProgramming = new Courses("Java", 5, roomNumbers);*/

    }
}
