package com.springdatajpa.test.springdatajpa.service;


import com.springdatajpa.test.springdatajpa.DTO.CourseDTO;
import com.springdatajpa.test.springdatajpa.DTO.CourseMaterialDTO;
import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.repository.CourseMaterialRepository;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseMaterialService {
    @Autowired
    private CourseMaterialRepository CMRepo;
    @Autowired
    private CourseRepository CRepo;

    public String addCourseMaterial(CourseMaterialDTO courseMaterialDTO){
        if(CRepo.findById(courseMaterialDTO.getCourse_id()).isPresent()){
            Course crs=CRepo.findById(courseMaterialDTO.getCourse_id()).get();
            courseMaterial crm= courseMaterial.builder().url(courseMaterialDTO.getUrl())
                    .course(crs)
                    .build();
            CMRepo.save(crm);
            return "course material added succesfully";
        }
        else{
            log.info("the course you are targeting doesn't exist");
            return "course doesn't exist!! review you informations";
        }

    }
    public String addCourseAndMaterial(String url, CourseDTO courseDTO){
        Course crs=Course.builder()
                        .title("security des si")
                                .credit(3000)
                .build();
        courseMaterial crm=courseMaterial.builder()
                .url(url)
                .course(crs)
                .build();
        CMRepo.save(crm);
        return "material added succefully";

    }

}
