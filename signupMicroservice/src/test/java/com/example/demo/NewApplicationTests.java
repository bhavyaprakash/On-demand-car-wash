package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import  org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;


@SpringBootTest
class NewApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private LoginService loginService;
	
	@MockBean
	private LoginRepository loginRepository;
	
	
	@Test
	void testAddLogin() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		Mockito.when(loginRepository.save(login)).thenReturn(login);
		assertEquals(login, loginService.addLoginDetails(login));
	}

	@Test
	void testfindByLoginId() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		Mockito.when(loginRepository.findById(1)).thenReturn(login);
		assertEquals(login, loginService.getLoginById(1));
	}

	@Test
	void testUpdateLoginPass() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		loginRepository.save(login);
		login.setPass("dwkk12");
		loginRepository.save(login);

		assertEquals("dwkk12", login.getPass());
	}

	@Test
	void testUpdateLoginId() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		loginRepository.save(login);
		login.setId(2);
		loginRepository.save(login);

		assertEquals(2, login.getId());
	}

	@Test
	void testUpdateEmail() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		loginRepository.save(login);
		login.setEmail("abc@gmail.com");
		loginRepository.save(login);

		assertEquals("abc@gmail.com", login.getEmail());
	}

	@Test
	void testdeleteUserById() {
		Login login = new Login(1, "dhh@gmail.com", "edbeu");
		assertEquals("Account deleted", loginService.deleteLoginById(1));
	}
	 

}
