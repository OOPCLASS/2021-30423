package customClasses;

public class Course {
    public String name;
    public int creditsNumber;
    public int[] roomNumbers;

    public Course(String name, int creditsNumber, int[] roomNumbers) {
        this.name = name;
        this.creditsNumber = creditsNumber;
        this.roomNumbers = roomNumbers;
    }
}
