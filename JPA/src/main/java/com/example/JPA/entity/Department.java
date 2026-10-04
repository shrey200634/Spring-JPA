package com.example.JPA.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;


    @Column(unique = true , nullable = false , length = 100)
    private String name ;

    //for head doctor
    @OneToOne // department have the ownership
    @JoinColumn
    private Doctor headdoctor;

    // many to many mapping example

    @ManyToMany
    @JoinTable
    private Set<Doctor> doctors  = new HashSet<>();

}
