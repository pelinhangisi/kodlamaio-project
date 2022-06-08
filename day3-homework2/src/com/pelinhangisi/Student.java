package com.pelinhangisi;

public class Student extends User{
    private String course;

    public Student() {

    }

    public Student(int id, String fullName, String password, String email, String course) {
        super(id, fullName, password, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
