package ro.utcluj.model;

public class Student {
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;
    Course[] courses = new Course[10];

    public Student(String uniqueIdentificationNumber, String firstName, String lastName, Course[] courses) {
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        System.arraycopy(courses, 0, this.courses, 0, courses.length);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
