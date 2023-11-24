package com.springdatajpa.test.springdatajpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",sequenceName = "techSequence",allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "techSequence")
    private long teacher_id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teacherid",
    referencedColumnName = "teacher_id")
    private List<Course> courses;*/

    public Teacher(String f,String l){
        firstname=f;
        lastname=l;
    }

}
