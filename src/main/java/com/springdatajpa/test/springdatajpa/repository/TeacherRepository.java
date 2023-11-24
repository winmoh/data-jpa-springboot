package com.springdatajpa.test.springdatajpa.repository;

import com.springdatajpa.test.springdatajpa.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
