package com.springdatajpa.test.springdatajpa.service;


import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.model.Student;
import com.springdatajpa.test.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    private  StudentRepository SRepo;

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
        SRepo.getStudentByAge(age);
    }
}