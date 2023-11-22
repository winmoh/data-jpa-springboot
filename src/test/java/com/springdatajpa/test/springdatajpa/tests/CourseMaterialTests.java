package com.springdatajpa.test.springdatajpa.tests;
import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.repository.CourseMaterialRepository;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class CourseMaterialTests {

    @Autowired
    private CourseRepository CRepo;
    @Autowired
    private CourseMaterialRepository CMRepo;

    @AfterEach
    public void repoPreparation(){
        CRepo.deleteAll();
        CMRepo.deleteAll();

    }


    @Test
    public void oneToOneJoinTest(){
        Course crs=Course.builder()
                .title("devops for software engineering")
                .credit(220)
                .build();
        courseMaterial cmt= courseMaterial.builder()
                .url("https://www.devops-for-software/course1")
                .course(crs)
                .build();
        CRepo.save(crs);
        CMRepo.save(cmt);

    }


}
