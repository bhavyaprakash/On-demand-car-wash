package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.AdminModel;


public interface AdminRepository extends JpaRepository<AdminModel, Integer>{
	
	AdminModel findByUsername(String username);
}