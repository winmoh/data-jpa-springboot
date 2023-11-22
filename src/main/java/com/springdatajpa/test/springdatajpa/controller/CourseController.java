package com.springdatajpa.test.springdatajpa.controller;


import com.springdatajpa.test.springdatajpa.DTO.CourseDTO;
import com.springdatajpa.test.springdatajpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody CourseDTO CDTO){
        courseService.addCourse(CDTO);
        return "course added successfully";




    }

}
