package com.neoteric.neotericTechnologies.service;

import com.neoteric.neotericTechnologies.model.NeotericTechnologies;

public class LoginDetails {
    public NeotericTechnologies getLogin(NeotericTechnologies log,String userName,String password){

        if(log.login.email.equals(userName)&&log.login.password.equals(password))
        {

            System.out.println("Password is  matching");
            log.login.isLogin=true;

        }
        else if (!log.login.email.equals(log.register.email) || !log.register.email.contains("@"))
        {

            System.out.println("Email is not matching or may be invalid");

        }
        else
        {

            System.out.println("email or password not correct");
        }
        return log;
    }
}
