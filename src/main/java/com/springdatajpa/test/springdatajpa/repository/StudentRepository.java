package com.springdatajpa.test.springdatajpa.repository;


import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.model.Student;
import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Long> {


    @Query("select s from Students s where s.email=?1")
    Student getStudentByEmail(String email);



    @Query("select s.email from Students s where s.firstname Is not null ")
    List<String> getStudentsEmails();


    @Query(
            value = "select s.guardian_name ,s.guardian_email as email,s.guardian_mobile  from Students s where s.student_age>10 ",
            nativeQuery = true
    )
    List<Object[]> getAllGuardians();
    default List<Guardian> getAllGuardiansMapped() {
        List<Object[]> results = getAllGuardians();
        List<Guardian> guardians = new ArrayList<>();

        for (Object[] result : results) {
            guardians.add(new Guardian((String) result[0], (String) result[1], (String) result[2]));
        }

        return guardians;
    }

    @Query("select s from Students s where s.age=:age")
    Student getStudentByAge(@Param("age") int age);
}
