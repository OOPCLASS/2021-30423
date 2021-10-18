package model;

public class Student {

    public String uniqueIdentificationNumber;
    public String firstName;
    public char fathersInitial;
    public String lastName;
    public String emailAddress;
    public String phoneNumber;
    public String department;
    public boolean scholarship;
    public double average;
    public double lastYearAverage;

    public Student(){
        System.out.println("hello");
    }

    public Student(String uniqueIdentificationNumber, String firstName, char fathersInitial,
                   String lastName, String emailAddress, String phoneNumber, String department,
                   boolean scholarship, double average, double lastYearAverage){
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.firstName = firstName;
        this.fathersInitial = fathersInitial;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.scholarship = scholarship;
        this.average = average;
        this.lastYearAverage = lastYearAverage;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
