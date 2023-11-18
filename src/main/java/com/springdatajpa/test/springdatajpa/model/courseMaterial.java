package com.springdatajpa.test.springdatajpa.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name="materials")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class courseMaterial {
    @Id
    @SequenceGenerator(name = "materials_sequence",sequenceName = "materials_sequence",allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE,generator = "materials_sequence")
    private long id;

    @Column(nullable = false)
    private String url;


}
