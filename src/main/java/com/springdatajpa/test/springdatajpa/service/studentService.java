package com.springdatajpa.test.springdatajpa.service;


import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.model.Student;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.repository.CourseMaterialRepository;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import com.springdatajpa.test.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
studentService {
    @Autowired
    private  StudentRepository SRepo;
    @Autowired
    private CourseRepository CRepo;

    private CourseMaterialRepository CMRepo;
    public String addStudentWithCourses(){
        courseMaterial cml=courseMaterial.builder().url("http://www.blockchain.fff").build();
        Student std=Student.builder()
                .firstname("miloud")
                .lastname("ahsanAb")
                .email("mil@gmail.com")
                .age(44)
                .guardian(Guardian.builder()
                        .name("lwalid")
                        .email("lwalid@gmail.com")
                        .mobile("0606060606").build())
                .courses(List.of(Course.builder().title("blockchain for health pfa").credit(3999).courseMaterial(cml).build())).build();
    }

    public Student getStudentByEmail(String email){
        return SRepo.getStudentByEmail(email);
    }

    public List<String> getAllEmails(){
        return SRepo.getStudentsEmails();
    }

    public List<Guardian> getAllGuardiansForMajors(){
        return SRepo.getAllGuardiansMapped();
    }
    public Student getStudentByAge(int age){
        return SRepo.getStudentByAge(age);
    }


    public void testingOneToOne(){


    }


}
