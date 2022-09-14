package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.model.Car;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public Car addCar(Car user) {
		return userRepository.save(user);
		
	}
	public Car getCarById(int carId) {
		return userRepository.findByCarId(carId);
	}
	
	public Car updateCar(Car user) {
		return userRepository.save(user);
	}
	
	public String deleteCarById(int carId) {
		userRepository.deleteById(carId);
		return "User deleted";
	}
	
	
	public Profile addProfile(Profile profile) {
		return profileRepository.save(profile);
	}
	public Profile getProfileByIdI(int userId) {
		return profileRepository.findByUserId(userId);
	}
	public Profile updateProfile(Profile profile) {
		return profileRepository.save(profile);
	}
	
	
	
}
