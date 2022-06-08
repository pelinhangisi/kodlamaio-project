package com.pelinhangisi;

public class Instructor extends User{
    private String courseName;

    public Instructor() {

    }

    public Instructor(int id, String fullName, String password, String email, String courseName) {
        super(id, fullName, password, email);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
