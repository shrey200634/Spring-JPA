package com.example.JPA;

import com.example.JPA.entity.Patient;
import com.example.JPA.repository.PatientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepo patientRepo;
    @Test
    public  void testPatientRepo(){
//        List<Patient> patientList =patientRepo.findAll();
//        System.out.println(patientList);

        Patient patient = patientRepo.findByName("Diya Patel");
        System.out.println(patient);

    }


}
