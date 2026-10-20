package com.example.JPA;

import com.example.JPA.entity.Insaurance;
import com.example.JPA.entity.Patient;
import com.example.JPA.service.InsauranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsauranceTest {

    @Autowired
    private InsauranceService insauranceService ;

    @Test
    public  void testInsaurance(){
        Insaurance insaurance = Insaurance.builder()
                .policyNumber("HDFC*^@")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030 , 12 , 12))
                .build();

        Patient patient = insauranceService.assignInsaurance(insaurance , 1L);
        System.out.println(patient);

    }
}
