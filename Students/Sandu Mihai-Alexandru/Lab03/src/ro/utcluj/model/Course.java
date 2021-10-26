package ro.utcluj.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Course {
    public String name;
    public int creditsNumber;
    public int[] roomNumbers = new int[10];

    public Course(String name, int creditsNumber, int[] roomNumbers) throws IOException {
        this.name = name;
        this.creditsNumber = creditsNumber;
        System.arraycopy(roomNumbers, 0,this.roomNumbers,0,roomNumbers.length);
    }
}
