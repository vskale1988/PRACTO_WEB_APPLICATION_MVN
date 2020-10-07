package com.practo.controller;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.practo.model.UserDto;

public class LoginControllerTest {
	@Autowired
	LoginController loginController;
	@Test
	public void testValidWebUser() {
		UserDto userDto = new UserDto();
		userDto.setUsername("vijay");
		userDto.setPassword("kale");
		Optional<UserDto> user = Optional.of(userDto);
		
		ResponseEntity resEntity = new ResponseEntity(user,HttpStatus.OK);
		assertEquals(resEntity.getStatusCode(),loginController.validWebUser(user).getStatusCode());
	}

}
