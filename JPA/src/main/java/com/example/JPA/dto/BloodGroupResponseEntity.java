package com.example.JPA.dto;

import com.example.JPA.entity.BloodGroup;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BloodGroupResponseEntity {
    private BloodGroup bloodGroupType;
    private  Long count ;

}
