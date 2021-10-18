package com.company;

public class Course {
    public String courseName = "";
    public int courseCredits;
    public int[] roomNumbers = new int[10];

    public Course(String courseName, int courseCredits, int[] roomNumbers){
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        int i = 0;
        for(int number : roomNumbers)
        {
            this.roomNumbers[i] = number;
            i ++;
        }
    }
}
