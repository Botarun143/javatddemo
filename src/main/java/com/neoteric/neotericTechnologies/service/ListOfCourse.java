package com.neoteric.neotericTechnologies.service;

import com.neoteric.neotericTechnologies.model.Course;
import com.neoteric.neotericTechnologies.model.NeotericTechnologies;

import java.util.ArrayList;
import java.util.List;

public class ListOfCourse {

    public NeotericTechnologies viewCourse(NeotericTechnologies neotericTechnologies) {
        List<Course> courseList=null;
        if (neotericTechnologies.login.isLogin){
            courseList=new ArrayList<>();
            Course course1=new Course();
            course1.name="java";
            course1.fee=12000;
            course1.durations="2 months";
            Course course2=new Course();
            course2.name="java full stack developer";
            course2.fee=50000;
            course2.durations="6 months";
            Course course3=new Course();
            course3.name="java selenium";
            course3.fee=30000;
            course3.durations="4 months";
            courseList.add(course1);
            courseList.add(course2);
            courseList.add(course3);
            neotericTechnologies.courseList=courseList;
        }
        return neotericTechnologies;
    }
}
