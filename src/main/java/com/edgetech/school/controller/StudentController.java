package com.edgetech.school.controller;

import com.edgetech.school.model.Course;
import com.edgetech.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{Id}/courses")
    public List<Course> retrieveCoursesForStudent(@PathVariable int Id) {
        return studentService.retrieveCourses(Id);
    }

}
