package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.WasherModel;

public interface WasherRepository extends JpaRepository<WasherModel, String> {

}
