package com.example.JPA;

import com.example.JPA.entity.BloodGroup;
import com.example.JPA.entity.Patient;
import com.example.JPA.repository.PatientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepo patientRepo;
    @Test
    public  void testPatientRepo(){
//        List<Patient> patientList =patientRepo.findAll();
//        System.out.println(patientList);

//        List<Patient> patientList = patientRepo.findByBloodGroup(BloodGroup.A);
//        for(Patient patient : patientList){
//            System.out.println(patient);
//
//
//        }

//        int rowsUpdated = patientRepo.updateWithId("Arav Sharma" , 1L);
//        System.out.println(rowsUpdated);

        Page<Patient> patientList = patientRepo.findAllPatient(PageRequest.of(0 , 2));
        for (Patient patient : patientList){
            System.out.println(patient);
        }




    }}



