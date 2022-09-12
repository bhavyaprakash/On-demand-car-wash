package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel,String>{

	List<OrderModel> findByCustomerName (String username);

}
