package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.WasherModel;
import com.example.demo.repository.WasherRepository;

@Service
public class WasherService {
    @Autowired
    private WasherRepository washerRepository;
    public List<WasherModel> findAll(){
        List<WasherModel> washerList = washerRepository.findAll();
        if(washerList.size()>0){
            return washerList;
        }
        return null;
    }

    public String deleteById(String id){
        if(washerRepository.findById(id).isPresent()){
            washerRepository.deleteById(id);
            return "Successfully Deleted";
        }
        return "Could not Find any Item";
    }
}
