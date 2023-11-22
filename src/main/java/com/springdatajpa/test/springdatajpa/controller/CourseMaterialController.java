package com.springdatajpa.test.springdatajpa.controller;

import com.springdatajpa.test.springdatajpa.DTO.CourseDTO;
import com.springdatajpa.test.springdatajpa.DTO.CourseMaterialDTO;
import com.springdatajpa.test.springdatajpa.service.CourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courseMaterial")
public class CourseMaterialController {
    @Autowired
    private CourseMaterialService CMService;
    @PostMapping("/addCourseMatrial")
    private String  addCourseMaterial(@RequestBody CourseMaterialDTO courseMaterialDTO){
        return CMService.addCourseMaterial(courseMaterialDTO);


    }
    @PostMapping("/addingCourseAndMaterial")
    public String addingBoth(@RequestParam String url, @RequestBody CourseDTO courseDTO){
        return CMService.addCourseAndMaterial(url,courseDTO);
    }
}
