package com.example.JPA.service;


import com.example.JPA.entity.Insaurance;
import com.example.JPA.entity.Patient;
import com.example.JPA.repository.InsauranceRepo;
import com.example.JPA.repository.PatientRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsauranceService {

    private final PatientRepo patientRepo ;
    private final InsauranceRepo insauranceRepo ;


    @Transactional
    public Patient assignInsaurance(Insaurance insaurance , Long Patient ){

        Patient patient = patientRepo.findById(Patient).orElseThrow(()-> new EntityNotFoundException("Patient not exist "));
        patient.setInsaurance(insaurance);
        insaurance.setPatient(patient); // maintain bidirectional mapping

        return patient ;



    }
}
