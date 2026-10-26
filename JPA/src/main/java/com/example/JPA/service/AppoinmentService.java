package com.example.JPA.service;

import com.example.JPA.entity.Appoinment;
import com.example.JPA.entity.Doctor;
import com.example.JPA.entity.Patient;
import com.example.JPA.repository.AppointmentRepository;
import com.example.JPA.repository.DoctorRepos;
import com.example.JPA.repository.PatientRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppoinmentService {

    private final PatientRepo patientRepo;
    private final DoctorRepos doctorRepos ;
    private final AppointmentRepository appointmentRepository ;


    @Transactional   // along with the rransaction we have to see the cascading also
    public  void createAPP(Appoinment appoinment ,Long doctorId , Long patientId ){
        Doctor doctor = doctorRepos.findById(doctorId).orElseThrow(()->new EntityNotFoundException("doctor not found "));
        Patient patient = patientRepo.findById(patientId).orElseThrow(()-> new EntityNotFoundException("patient is not found by this id "));

        if (appoinment.getId()!= null ) throw  new IllegalArgumentException("appoinment should not have been there ");

        // appoinment own the relationship . means we have to set the appoinment
        appoinment.setPatient(patient);
        appoinment.setDoctor( doctor);

        appointmentRepository.save(appoinment);
    }
}
