package com.example.demo;


	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	import java.util.Optional;


	@Repository
	@Transactional(readOnly = true)
	public interface WashDetailsRepository extends JpaRepository<WashDetails, Long> {

	  

	}


