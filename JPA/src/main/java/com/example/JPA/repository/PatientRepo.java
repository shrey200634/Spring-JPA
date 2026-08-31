package com.example.JPA.repository;

import com.example.JPA.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient , Long> {

    Patient findByName(String name );

}
