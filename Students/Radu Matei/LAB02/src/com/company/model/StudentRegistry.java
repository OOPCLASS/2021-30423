package com.company.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    public List<Student> studentList= new ArrayList<>();
    private int studentNb;

    public StudentRegistry(){
        this.studentNb = 0;
    }

    public void readNStudentsFromFile(String path, int n ,CourseList globalCourseList) throws IOException {
        File file = new File(path);
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));

        for (int i = 0; i < n; i++) {
            String unparsedStudentData;
            if ((unparsedStudentData = br.readLine()) == null) {
                break;
            }

            String[] studentData = unparsedStudentData.split(" - ");
            String[] studentName = studentData[1].split(" ");
            String studentCode = studentData[0];
            studentData[1] = "";
            studentData = studentData[2].split(", ");
            CourseList studentCourses = new CourseList();
            for (String studentDatum:studentData) {
                studentCourses.addCourse(globalCourseList.courses.get(studentDatum));
            }
            Student readStudent = new Student(studentCode, studentName[0], studentName[1], studentCourses);
            studentList.add(readStudent);
            this.studentNb++;
        }
    }

    public Student getStudentN(int n){
        if(n<studentNb){
            return this.studentList.get(n);
        }
        return new Student();
    }


}
