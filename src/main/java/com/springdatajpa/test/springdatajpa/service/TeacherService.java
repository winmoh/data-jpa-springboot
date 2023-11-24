package com.springdatajpa.test.springdatajpa.service;

import com.springdatajpa.test.springdatajpa.DTO.TeacherDTO;
import com.springdatajpa.test.springdatajpa.DTO.TeacherDTO2;
import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.Teacher;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import com.springdatajpa.test.springdatajpa.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository TRepo;
    @Autowired
    private CourseRepository CRepo;

    public String addTeacher(TeacherDTO teacherDTO){
        List<Course> crss=teacherDTO.getCourses().stream().map(courseid-> Course.builder()
                .title(CRepo.findById(courseid).get().getTitle())
                .credit(CRepo.findById(courseid).get().getCredit())
                .build()).toList();

        Teacher teacher=Teacher.builder()
                .firstname(teacherDTO.getFirstname())
                .lastname(teacherDTO.getLastname())
                .courses(crss)
                .build();
        TRepo.save(teacher);
        return "teacher added succefully";
    }
    public String addTEchAndCrs(TeacherDTO2 teacherDTO2){
        Course crs2=Course.builder()
                .title("java /JEE")
                .credit(20000)
                .courseMaterial(courseMaterial.builder()
                        .url("http://www.JEE.comm").build())
                .build();
        Course crs3=Course.builder()
                .title("spring/spring boot")
                .credit(90000)
                .courseMaterial(courseMaterial.builder()
                        .url("http://www.spring.comm").build())
                .build();

        Course crs4=Course.builder()
                .title("angular/react")
                .credit(70000)
                .courseMaterial(courseMaterial.builder()
                        .url("http://www.front.comm").build())
                .build();
        Course crs5=Course.builder()
                .title("data egineering")
                .credit(45000)
                .courseMaterial(courseMaterial.builder()
                        .url("http://www.datae.comm").build())
                .build();
        Teacher teacher=Teacher.builder()
                .firstname(teacherDTO2.getFirstname())
                .lastname(teacherDTO2.getLastname())
                .courses(List.of(crs2,crs3,crs4,crs5))
                .build();
        TRepo.save(teacher);
        return "teacher added";

    }

}
