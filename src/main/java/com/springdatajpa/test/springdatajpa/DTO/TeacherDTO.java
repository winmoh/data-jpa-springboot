package com.springdatajpa.test.springdatajpa.DTO;

import com.springdatajpa.test.springdatajpa.model.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherDTO {
    private String firstname;
    private String lastname;
    private List<Long> courses;
}
