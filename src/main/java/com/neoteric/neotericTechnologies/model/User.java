package com.neoteric.neotericTechnologies.model;

public class User {
    public String firstName;
    public String lastName;
    public String mobileNo;
    public String email;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
