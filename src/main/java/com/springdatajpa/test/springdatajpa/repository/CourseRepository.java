package com.springdatajpa.test.springdatajpa.repository;

import com.springdatajpa.test.springdatajpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
