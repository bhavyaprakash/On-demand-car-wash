package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminModel;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public String save(AdminModel adminModel){
        adminRepository.save(adminModel);
        return "Added";
    }

	public Object deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

