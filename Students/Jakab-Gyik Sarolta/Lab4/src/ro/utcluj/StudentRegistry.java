package ro.utcluj;

import java.util.ArrayList; // import the ArrayList class

public class StudentRegistry {
    public static ArrayList<Student> myClass;

    public StudentRegistry(){
        myClass = new ArrayList<Student>(); // Create an ArrayList object
    }

    public void insertNewStudent(Student newStudent){
        myClass.add(newStudent);
    }

    public void getRegistry(){
        for (int count = 0; count < myClass.size(); count++) {
            String gradesForStudent = "";
            Student student = myClass.get(count);
            for (int i = 0; i < student.grades.size(); i++) {
                gradesForStudent = gradesForStudent + student.grades.get(i) + " ";
            }
            System.out.println(student.firstName + " " + student.lastName + " " + gradesForStudent);

        }
    }
}
