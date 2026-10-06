package com.example.JPA.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(length = 100)
    private String name ;

    @Column(length = 100)
    private String specilization ;

    @Column(unique = true , name = "email" , length = 100)
    private String email ;

   @OneToMany(mappedBy = "doctor")
    private List<Appoinment> appoinments;

   @ManyToMany(mappedBy = "doctors")
   private Set<Department> departments = new HashSet<>();



}
