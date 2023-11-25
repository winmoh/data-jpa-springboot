package com.springdatajpa.test.springdatajpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "Students")
@Table(name="Students", uniqueConstraints ={
        @UniqueConstraint(columnNames = "student_email",name = "unique_email_constraint")
})
public class Student {


    @Id
    @SequenceGenerator(name="student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy=SEQUENCE,generator = "student_sequence")
    @Column(name="student_id")
    private long id;

    @Column(name="first_name",columnDefinition = "TEXT")
    private String firstname;

    @Column(name = "last_name",columnDefinition = "TEXT")
    private String lastname;

    @Column(name="student_email")
    private String  email;

    @Column(name="student_age",nullable = false)
    private int age;

    @Embedded
    private Guardian guardian;

    @ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
    private List<Course> courses;

    @Override
    public String toString() {
        return "Student{" +
                " firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", guardian=" + guardian +
                '}';
    }

    public Student(String f, String l, String e, int a){
        firstname=f;
        lastname=l;
        email=e;
        age=a;


    }



}
