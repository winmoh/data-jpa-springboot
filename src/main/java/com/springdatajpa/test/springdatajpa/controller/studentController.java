package com.springdatajpa.test.springdatajpa.controller;


import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class studentController {

    @Autowired
    private studentService SService;


    @PostMapping("/getStudentByEmail")
    public String getStudentByEmail(@RequestParam String email){
          return SService.getStudentByEmail(email).toString();
    }
    @PostMapping("/getStudentByAge")
    public String getStudentByEmail(@RequestParam int age){
        return SService.getStudentByAge(age).toString();
    }

    @GetMapping("/getAllEmails")
    public List<String> getStudentEmails(){
        return SService.getAllEmails();
    }

    @GetMapping("/getAllguardiansForten")
    public List<Guardian> getAllGuardiansForMajors(){
        return SService.getAllGuardiansForMajors();
    }
}
