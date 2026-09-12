package com.example.JPA.repository;

import com.example.JPA.dto.BloodGroupResponseEntity;
import com.example.JPA.entity.BloodGroup;
import com.example.JPA.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient , Long> {

    Patient findByName(String name );

    List<Patient> findByNameContaining(String q);


    @Query("SELECT p FROM Patient  p where p.bloodGroup=?1")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroup bloodGroup);


    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET  p.name = :name where p.id=:id")
    int updateWithId(@Param("name") String name , @Param("id") Long id );


    @Query("select new com.example.JPA.dto.BloodGroupResponseEntity(p.bloodGroup," +
            " Count(p)) from Patient p group by p.bloodGroup")
    List<BloodGroupResponseEntity> countEachBloodGroupType();








}
