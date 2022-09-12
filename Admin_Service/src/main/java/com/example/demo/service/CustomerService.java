package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerModel;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<CustomerModel> findAll(){
        List<CustomerModel> customerList = customerRepository.findAll();
        if(customerList.size()>0){
            return customerList;
        }
        return null;
    }

    public String deleteById(String id){
        if(customerRepository.findById(id).isPresent()){
            customerRepository.deleteById(id);
            return "Successfully Deleted";
        }
        return "Could not any Item";
    }
}

