package com.neoteric.javatddemo.service;

import com.neoteric.javatddemo.model.Admission;
import com.neoteric.javatddemo.model.Student;

import java.util.UUID;

public class StudentService
{
    public Admission getAdmission(Student dinesh)
    {
        Admission admission=null;

        if (dinesh.age > 6) {

            admission = new Admission();
            admission.rollNO = "ts" + UUID.randomUUID().toString();
            admission.fee = 1000;
            admission.Standard = dinesh.standard;
        }
        return admission;
    }
}
