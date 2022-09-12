package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderModel;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderModel> orderFindAll() {
        List<OrderModel> orderList = orderRepository.findAll();
        if(orderList.size()>0){
            return orderList;
        }
        return null;
    }
    public String deleteById(String id){
        orderRepository.deleteById(id);
        return "Successfully Deleted";
    }


}