package com.example.JPA.repository;


import com.example.JPA.entity.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appoinment, Long> {
}