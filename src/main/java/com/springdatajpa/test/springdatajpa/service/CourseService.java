package com.springdatajpa.test.springdatajpa.service;

import com.springdatajpa.test.springdatajpa.DTO.CourseDTO;
import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository CRepo;

    public Course addCourse(CourseDTO courseDTO){
        Course crs=Course.builder()
                .title(courseDTO.getTitle())
                .credit(courseDTO.getCredit()).build();
        CRepo.save(crs);
        return  crs;

    }


}
