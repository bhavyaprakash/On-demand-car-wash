package com.example.demo.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerModel {
    @Id
    private String id;
    private String username;
    
    private String customerPlace;
    private String customerAddress;
    private String customerRating;
    private String customerEmail;
}
