package com.pelinhangisi;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1, "Pelin Hangişi", "1234", "pelin@test.com", " java");
        Instructor instructor = new Instructor(2, "Engin Demiroğ", "12345", "engin@test.com", " Java&React");

        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.createCourse(instructor);
    }
}
