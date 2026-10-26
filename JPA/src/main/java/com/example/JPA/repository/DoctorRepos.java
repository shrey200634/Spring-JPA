package com.example.JPA.repository;


import com.example.JPA.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepos extends JpaRepository<Doctor, Long> {
}