//Each Student contains UIN, surname, name.

public class Student {

    //Attributi
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;

    //Costruttori
    public Student() {/*System.out.println("Blank Student");*/}

    public Student(String firstName, String lastName, String uniqueIdentificationNumber) {
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getter

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public String getUniqueIdentificationNumber() { return this.uniqueIdentificationNumber; }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUniqueIdentificationNumber(String uniqueIdentificationNumber) {
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
    }
}
