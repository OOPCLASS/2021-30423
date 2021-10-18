package ro.utcluj;

import java.util.ArrayList;

public class Courses {
    public String name;
    public int creditsNumber;
    public ArrayList<Integer> roomNumbers;

    public Courses(String name, int creditsNumber) {
        this.name = name;
        this.creditsNumber = creditsNumber;
        roomNumbers = new ArrayList<>();
    }
    public void addRoomNumbers(Integer roomNumbers) {
        this.roomNumbers.add(roomNumbers);
    }

    public void listCourse() {
        System.out.print(this.name + " " + this.creditsNumber);
        for (int i = 0; i < this.roomNumbers.size(); i++) {
            System.out.print(this.roomNumbers.get(i) + " ");
        }
        System.out.println();
    }

}
