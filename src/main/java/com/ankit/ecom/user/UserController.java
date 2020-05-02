package com.ankit.ecom.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
//	private UserService userService;
	
	@GetMapping("/testLogin")
	public ResponseEntity<String> login() {
//		userService.authenticate();
		return new ResponseEntity<String>("success".toString(), HttpStatus.OK);
	}
}
