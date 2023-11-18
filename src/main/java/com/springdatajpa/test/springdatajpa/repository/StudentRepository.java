package com.springdatajpa.test.springdatajpa.repository;


import com.springdatajpa.test.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
