package com.springdatajpa.test.springdatajpa.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherDTO2 {
    private String firstname;
    private String lastname;
}
