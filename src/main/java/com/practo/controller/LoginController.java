package com.practo.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practo.model.UserDto;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/authenticate")
public class LoginController {
	public ResponseEntity<String> validWebUser(@RequestBody Optional<UserDto> user) {
		String username = null;
		if (user.isPresent()) {
			username = user.get().getUsername();
		}
		return new ResponseEntity<>(username, HttpStatus.OK);
	}

}
