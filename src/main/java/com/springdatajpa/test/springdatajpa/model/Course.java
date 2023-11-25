package com.springdatajpa.test.springdatajpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long course_id;

    @Column(columnDefinition = "TEXT")
    private String title;

    @Column(nullable = false)
    private int credit;


    @OneToOne(mappedBy = "course",cascade = CascadeType.ALL)
    private courseMaterial courseMaterial;


    @ManyToOne()
    @JoinColumn(name="teacherid",referencedColumnName = "teacher_id")
    private Teacher teacher;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="stuents_courses",
            joinColumns = @JoinColumn(
                    name="course",
                    referencedColumnName="course_id"
            ),
            inverseJoinColumns=@JoinColumn(
                    name="student",
                    referencedColumnName="student_id"
            )
            )
    private List<Student> students;





}
