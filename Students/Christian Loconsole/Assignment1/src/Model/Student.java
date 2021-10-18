package Model;

public class Student {
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;

    public Student() {
        System.out.println("I'm a blank student");
    }

    public Student(String firstName, String lastName, String uniqueIdentificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniqueIdentificationNumber() {
        return uniqueIdentificationNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUniqueIdentificationNumber(String uniqueIdentificationNumber) {
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
    }
}
