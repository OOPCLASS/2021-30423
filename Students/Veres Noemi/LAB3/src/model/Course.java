package model;

public class Course {
    public String name;
    public int creditsNumber;
    public String[] roomNumbers = new String[3];

    public Course (String name, int creditsNumber, String[] roomNumbers){
        this.name = name;
        this.creditsNumber = creditsNumber;
        for(int i = 0; i < 3; i++) {
                this.roomNumbers[i] = roomNumbers[i];
                i++;
        }
    }
}
