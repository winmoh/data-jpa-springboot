package com.springdatajpa.test.springdatajpa.service;

import com.springdatajpa.test.springdatajpa.DTO.CourseDTO;
import com.springdatajpa.test.springdatajpa.model.*;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public String addCourseWithStudentMapping(){
        Teacher teacher =Teacher.builder()
                .firstname("ayoub")
                .lastname("ayoub")
                .build();
        Student std =Student.builder()
                .firstname("mohamed")
                .lastname("mohamed")
                .email("MohAou@gmail.com")
                .age(23)
                .guardian(Guardian.builder()
                        .email("abdellah@gmail.com")
                        .name("abdellah")
                        .mobile("060303003").build())

                .build();
        List<Student> stds=new ArrayList<Student>();
        stds.add(std);
        Course crs=Course.builder()
                .title("ci/cd in devsecops")
                .credit(3900)
                .courseMaterial(courseMaterial.builder().url("http://www.devsecops:456").build())
                .students(stds)
                .build();
        CRepo.save(crs);
        return "course added succefully";



    }


}
