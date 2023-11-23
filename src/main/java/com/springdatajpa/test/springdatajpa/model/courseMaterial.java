package com.springdatajpa.test.springdatajpa.model;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.SEQUENCE;


// jpa  java persitence api est une specification qui definit un ensemnble de interface pour interagir avec les bases de données relationnel
//jpa is only a specificatioon that only define methods for ORM porcessess but it cannot perorm these object-relationnal management ,although hibernate is a java framework and orm tool that impleents jpa
//spring data jpa is only a high level orm
@Entity(name="materials")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "course")
public class courseMaterial {
    @Id
    @SequenceGenerator(name = "materials_sequence",sequenceName = "materials_sequence",allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "materials_sequence")
    private long id;

    @Column(nullable = false)
    private String url;

    @OneToOne(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",
            referencedColumnName = "course_id")
    private Course course;


}

