package com.springdatajpa.test.springdatajpa.repository;

import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<courseMaterial,Long> {

}
