package com.springdatajpa.test.springdatajpa.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseMaterialDTO {
    private String url;
    private Long course_id;


}
