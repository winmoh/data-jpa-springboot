package com.springdatajpa.test.springdatajpa.controller;


import com.springdatajpa.test.springdatajpa.DTO.TeacherDTO;
import com.springdatajpa.test.springdatajpa.DTO.TeacherDTO2;
import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.Teacher;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherService TService;

    @PostMapping("/addTeacher")
    public String addTeacher(@RequestBody TeacherDTO teacherDTO){
        return TService.addTeacher(teacherDTO);

    }

    @PostMapping("/addTeacherCrs")
    public  String addTeacherAndCourses(@RequestBody TeacherDTO2 teacherDTO2){
        return  TService.addTEchAndCrs(teacherDTO2);




    }
    @GetMapping("/getTeachers1")
    public List<Teacher> getTeachers1(){
        return TService.pagingTesting();
    }



}
