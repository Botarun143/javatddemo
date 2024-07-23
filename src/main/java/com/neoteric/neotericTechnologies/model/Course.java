package com.neoteric.neotericTechnologies.model;

public class Course {
    public String name;
    public double fee;
    public String durations;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                ", durations='" + durations + '\'' +
                '}';
    }
}
