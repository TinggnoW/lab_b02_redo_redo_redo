package com.fsse2401.lab_b02_redo_redo_redo.DATA.COURSE.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fsse2401.lab_b02_redo_redo_redo.DATA.PERSON.DTO.PersonResponseDto;

import java.util.List;

public class CourseResponseDto {
    @JsonProperty("course_id")
    private String courseId;
    @JsonProperty ("course_name")
    private String courseName;
    private double price;
    private PersonResponseDto teacher;
    private List<PersonResponseDto> students;

    public CourseResponseDto(String courseId, String courseName, double price, PersonResponseDto teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
        this.teacher = teacher;
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
}
