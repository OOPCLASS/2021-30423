package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentRegistry {
    public Student[] arrayOfStudents;
    public String studentRegistryId;

    public StudentRegistry() {
        System.out.println("I'm a blank StudentRegistry");
    }

    public StudentRegistry(String studentRegistryId, Student[] arrayOfStudents) {
        this.studentRegistryId = studentRegistryId;
        this.arrayOfStudents = arrayOfStudents;
    }

    public String getStudentRegistryId() {
        return studentRegistryId;
    }

    public void showArrayOfStudents() {
        for (int i=0;i< arrayOfStudents.length;i++) {
            if (arrayOfStudents[i] != null) {
                System.out.println(arrayOfStudents[i].firstName);
            }
        }
    }

    /* I can insert students into the free cells of the array in different positions also
    with different name,surname and ID assigned from input if my constructor is empty.
    Not strictly required but I had fun */

        public void addStudent (Student student,int position){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                if (arrayOfStudents[position] == null && student.getFirstName()==null) {
                    try {
                        System.out.println("Insert student firstName: ");
                        String input1 = br.readLine();
                        student.setFirstName(input1);
                        System.out.println("Insert student lastName: ");
                        String input2 = br.readLine();
                        student.setLastName(input2);
                        System.out.println("Insert student uniqueIdentificationNumber: ");
                        String input3 = br.readLine();
                        student.setUniqueIdentificationNumber(input3);
                        arrayOfStudents[position] = student;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }else if (arrayOfStudents[position]==null){
                    arrayOfStudents[position] = student;
                }

    }
}



