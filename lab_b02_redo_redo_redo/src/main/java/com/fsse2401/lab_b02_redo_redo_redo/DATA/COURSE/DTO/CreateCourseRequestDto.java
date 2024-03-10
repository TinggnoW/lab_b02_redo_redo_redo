package com.fsse2401.lab_b02_redo_redo_redo.DATA.COURSE.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCourseRequestDto {

    @JsonProperty ("course_id")
    private String courseId;
    @JsonProperty ("course_name")
    private String courseName;
    private double price;
    private String teacherHkid;

    public CreateCourseRequestDto(String courseId, String courseName, double price, String teacherhkid) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
        this.teacherHkid = teacherHkid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTeacherHkid() {
        return teacherHkid;
    }

    public void setTeacherHkid(String teacherHkid) {
        this.teacherHkid = teacherHkid;
    }
}
