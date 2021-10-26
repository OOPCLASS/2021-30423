package com.company.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CourseList {

    public LinkedHashMap <String,Course> courses = new LinkedHashMap<>();
    public int noCourses;

    public CourseList(){
        this.noCourses = 0;
    }

    public void addCourse(Course course){
        courses.put(course.courseName,course);
    }

    public String[] listAllCourses(){
        return courses.keySet().toString().replace("[","").replace("]","").split(", ");
    }

    public void readNCoursesFromFile(String path, int n ) throws IOException {
        File file = new File(path);
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));

        for(int i=0;i<n;i++){
            String unparsedCourseData;
            if((unparsedCourseData = br.readLine()) == null){return;}

            String[] courseData = unparsedCourseData.replace(",","").split("  ");
            String courseName = courseData[0];
            int courseCredits = Integer.parseInt(courseData[1]);
            courseData[1] = "";
            courseData = courseData[2].split(" ");
            ArrayList<Integer> roomList = new ArrayList<>();
            for (String courseDatum : courseData) {
                roomList.add(Integer.parseInt(courseDatum));
            }
            Course readCourse = new Course(courseName,courseCredits,roomList);
            courses.put(readCourse.courseName, readCourse);
            this.noCourses++;
        }
    }


}
