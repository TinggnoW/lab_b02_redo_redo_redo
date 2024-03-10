package com.fsse2401.lab_b02_redo_redo_redo.API.COURSE;

import com.fsse2401.lab_b02_redo_redo_redo.SERVICE.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseApi {
    @Autowired
    private final CourseService courseService;

    public CourseApi(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/course")
    public void createCourse (@RequestBody )
}
