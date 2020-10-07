package com.practo.controller;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.practo.model.UserDto;
@RunWith(SpringRunner.class)
public class LoginControllerTest {
	@InjectMocks
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
