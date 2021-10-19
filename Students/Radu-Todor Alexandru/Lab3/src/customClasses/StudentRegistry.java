package customClasses;

public class StudentRegistry {
    public int numberOfStudents = 1;
    public Student[] student = new Student[20];

    public StudentRegistry() {
        student[0] = new Student("Alex", "RT", 2070, new Course[]{
                new Course("oop", 5, new int[]{21, 209}),
                new Course("db", 4, new int[]{3, 214})
        });
    }

    public void printRegistry() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(student[i].firstName + " " + student[i].lastName + " " + student[i].uniqueIdentificationNumber);
            for (int j = 0; j < student[i].courses.length; j++) {
                System.out.print("  " + student[i].courses[j].name + " " + student[i].courses[j].creditsNumber);
                for (int k = 0; k < student[i].courses[j].roomNumbers.length; k++) {
                    System.out.print(" " + student[i].courses[j].roomNumbers[k]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void addStudent(String firstName, String lastName, int uniqueIdentificationNumber, Course[] courses) {
        student[numberOfStudents] = new Student(firstName, lastName, uniqueIdentificationNumber, courses);
        numberOfStudents++;
    }
}
