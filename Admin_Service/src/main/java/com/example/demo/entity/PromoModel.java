package com.example.demo.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromoModel {
    @Id
    private String id;
    private String code;
    private double price;
    private String description;
    private boolean active;
}