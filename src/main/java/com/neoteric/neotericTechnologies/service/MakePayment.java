package com.neoteric.neotericTechnologies.service;

import com.neoteric.neotericTechnologies.model.CourseJoinDetails;
import com.neoteric.neotericTechnologies.model.NeotericTechnologies;

public class MakePayment {
    public CourseJoinDetails makePayment(NeotericTechnologies neotericTechnologies,double fee)
    {
        CourseJoinDetails courseJoinDetails=null;
        if (neotericTechnologies.course.fee==fee)
        {
            System.out.println("Payment successful");
            courseJoinDetails=new CourseJoinDetails();
            courseJoinDetails.isJoined=true;
            courseJoinDetails.course= neotericTechnologies.course;
            courseJoinDetails.userDetails= neotericTechnologies.user;

        }
        else
        {
            System.out.println("payment fail");
        }
        return courseJoinDetails;
    }
}
