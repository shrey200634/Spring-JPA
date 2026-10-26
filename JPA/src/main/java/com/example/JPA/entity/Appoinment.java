package com.example.JPA.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appoinment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable = false)
    private LocalDateTime appoinmentTime ;

    @Column(length = 500)
    private String reason ;

    @ManyToOne  // no need to define the cascading cauz we dont want when appoinment is form patient is also form
    @JoinColumn(name = "patient_id " , nullable = false) // owing side
    private Patient patient;


    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;



}
