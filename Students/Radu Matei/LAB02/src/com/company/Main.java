package com.company;

import com.company.model.CourseList;
import com.company.model.StudentRegistry;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CourseList globalCourseList = new CourseList();
        globalCourseList.readNCoursesFromFile("C:\\Users\\Rog\\Documents\\OOP Labs\\LAB02\\src\\com\\company\\courses.txt", Integer.MAX_VALUE);

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.readNStudentsFromFile("C:\\Users\\Rog\\Documents\\OOP Labs\\LAB02\\src\\com\\company\\students.txt", Integer.MAX_VALUE, globalCourseList);
    }

}
