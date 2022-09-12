package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PromoModel;

public interface PromoRepository extends JpaRepository<PromoModel,String>{

	 PromoModel findByCode(String code);

}
