package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CustomerModel;

public interface CustomerRepository extends JpaRepository <CustomerModel, String>{
	@Query("{'pending' : ?true}")
    List<CustomerModel> findPending();

    @Query("{'completed' : ?true}")
    List<CustomerModel> findCompleted();

    @Query("{'review' : ?0}")
    void findReview();
}
