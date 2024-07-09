package com.neoteric.javatddemo;

import com.neoteric.javatddemo.model.Address;
import com.neoteric.javatddemo.model.Admission;
import com.neoteric.javatddemo.model.Student;
import com.neoteric.javatddemo.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {
    @Test
    public void getStuentzGreaterthanSix() {

        Student dinesh = new Student();
        dinesh.name="tarun";
        dinesh.age=18;
        Address address=new Address();
        address.flatNo="143";
        address.area="kokatpalli";
        address.street="KPHB";
        address.city="Hyderabad";
        address.pincode="532185";
        dinesh.address=address;
        dinesh.standard="2";
        StudentService service=new StudentService();
        Admission admission=service.getAdmission(dinesh);

        Assertions.assertNotNull(admission.rollNO);


    }
}
