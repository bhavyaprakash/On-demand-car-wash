package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarDetailsModel;
import com.example.demo.repository.CarDetailsRepository;

@Service
public class CarDetailsService {
    @Autowired
    private CarDetailsRepository carDetailsReposistory;
    public void save (CarDetailsModel car){
        carDetailsReposistory.save(car);
    }

    public List<CarDetailsModel> findAll(){
        List<CarDetailsModel> carDetailsList = carDetailsReposistory.findAll();
        if(carDetailsList.size()>0){
            return carDetailsList;
        }
        return null;
    }

    public String deleteById(String id){
        if(carDetailsReposistory.findById(id).isPresent()){
            carDetailsReposistory.deleteById(id);
            return "Successfully Deleted";
        }
        return "Could not any Item";
    }
}

