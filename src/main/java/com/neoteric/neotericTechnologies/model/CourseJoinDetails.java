package com.neoteric.neotericTechnologies.model;

public class CourseJoinDetails {
    public User userDetails;
    public Course course;
    public boolean isJoined;

    @Override
    public String toString() {
        return "CourseJoinDetails{" +
                "userDetails=" + userDetails +
                ", course=" + course +
                ", isJoined=" + isJoined +
                '}';
    }
}
