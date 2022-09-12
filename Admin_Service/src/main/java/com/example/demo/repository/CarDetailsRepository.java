package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarDetailsModel;

public interface CarDetailsRepository extends JpaRepository <CarDetailsModel,String> {

}
