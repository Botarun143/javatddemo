package com.neoteric.neotericTechnologies.service;

import com.neoteric.neotericTechnologies.model.NeotericTechnologies;

public class SelectCourse {
    public NeotericTechnologies selectCourse(NeotericTechnologies neotericTechnologies,String courseName){

        for(int i=0;i<neotericTechnologies.courseList.size();i++)
        {
            if (neotericTechnologies.courseList.get(i).name.equals(courseName))
            {
                neotericTechnologies.course=neotericTechnologies.courseList.get(i);
            }
        }
        return neotericTechnologies;
    }
}
