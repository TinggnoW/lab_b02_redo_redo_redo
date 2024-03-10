package com.fsse2401.lab_b02_redo_redo_redo.DATA.COURSE.ENTITY;

import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.ENTITY.PersonEntity;

import java.util.List;

public class CourseEntity {
    private String courseId;
    private String name;
    private double price;
    private PersonEntity teacher;
    private List<PersonEntity> students;

    public CourseEntity(String courseId, String name, double price, PersonEntity teacher) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
