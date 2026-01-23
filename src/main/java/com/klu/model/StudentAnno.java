package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentAnno {

    @Value("201")
    private int studentId;

    @Value("Gnanasree")
    private String name;

    private String course;
    private int year;

    // Constructor Injection
    public StudentAnno(
            @Value("Spring Boot") String course,
            @Value("2026") int year) {
        this.course = course;
        this.year = year;
    }

    // Setter Injection
    @Value("Microservices")
    public void setCourse(String course) {
        this.course = course;
    }

    @Value("2027")
    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Course       : " + course);
        System.out.println("Academic Year: " + year);
    }
}
