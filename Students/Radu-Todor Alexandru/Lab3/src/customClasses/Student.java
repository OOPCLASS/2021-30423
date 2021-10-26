package customClasses;

public class Student {
    public int uniqueIdentificationNumber;
    public String lastName;
    public String firstName;
    public Course[] courses;

    public Student(String firstName, String lastName, int uniqueIdentificationNumber, Course[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.courses = courses;
    }
}
