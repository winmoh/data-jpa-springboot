package com.springdatajpa.test.springdatajpa.service;


import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.model.Student;
import com.springdatajpa.test.springdatajpa.repository.CourseMaterialRepository;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import com.springdatajpa.test.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    private  StudentRepository SRepo;
    @Autowired
    private CourseRepository CRepo;

    private CourseMaterialRepository CMRepo;


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
