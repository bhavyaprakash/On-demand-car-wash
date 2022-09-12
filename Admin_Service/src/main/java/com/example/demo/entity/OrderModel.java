package com.example.demo.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderModel {
    @Id
    private String id;
    private String customerName;
    private String customerEmail;
    private String washerName;
    private String washerEmail;
    private String promoCode;
    private String customerPlace;
    private String customerAddress;
    private String carType;
    private String addon;
    private double washcost;
    private double promoprice;
    private double addOnCost;
    private String date;
    private String time;
}
