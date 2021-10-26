package com.company;

public class Main {

    public static void main(String[] args) {
        int[] mathsRoomNumbers = {217,227};
        int[] oopRoomNumbers = {204,212};
        int[] dbRoomNumbers = {214,209};
        int[] emsRoomNumbers = {3,7};
        int[] faRoomNumbers = {21,29};
        Course course1 = new Course("Maths",5,mathsRoomNumbers);
        Course course2 = new Course("Object Oriented Programming",6,oopRoomNumbers);
        Course course3 = new Course("Databases",4,dbRoomNumbers);
        Course course4 = new Course("Electronic Measurement and Sensors",4,emsRoomNumbers);
        Course course5 = new Course("Fundamental Algorithms",6,faRoomNumbers);
        Student[] student = new Student[10];
        student[0] = new Student("Andrei","Lauran","501",course1);
        student[1] = new Student("Ionut","Pop","354",course5);
        student[2] = new Student("Andra","Dacu","214",course3);
        student[3] = new Student("Calin","Matei","636",course2);
        student[4] = new Student("Razvan","Lopataru","780",course5);
        student[5] = new Student("Neagoe","Basarab","245",course1);
        student[6] = new Student("Mihai","Viteazu","968",course3);
        student[7] = new Student("Klaus","Iohannis","759",course4);
        student[8] = new Student("Steve","Smith","204",course4);
        student[9] = new Student("Aiden","Altima","998",course2);
        for(int i = 0; i < student.length; i++)
        {
            student[i].getStudentInfo();
        }
    }
}
