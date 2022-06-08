package com.pelinhangisi;

public class InstructorManager {
    public void createCourse(Instructor instructor){
        System.out.println(instructor.getFullName() +instructor.getCourseName()+  " isimli yeni bir kurs oluşturdu.");
    }

    public void updateCourse(Instructor instructor){
        System.out.println(instructor.getFullName() + " mevcut kursta güncelleme yaptı.");
    }
}
