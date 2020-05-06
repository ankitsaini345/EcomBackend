package com.ankit.ecom.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.ecom.product.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/testLogin")
	public ResponseEntity<String> login() {
//		userService.authenticate();
		return new ResponseEntity<String>("success".toString(), HttpStatus.OK);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("inside db inside db inside db");
		log.info(passwordEncode().encode("passwd"));
//		passwordEncode().encode("passwd")
//		userRepo.save(new User("Ankit", "ankit345", passwordEncode().encode("passwd"),"ankitsaini345@gmail.com", "ADMIN"));
//		userRepo.save(new User("test", "test345", passwordEncode().encode("testpass"),"test345@gmail.com", "USER"));	
	}
	 @Bean
    PasswordEncoder passwordEncode() {
        return new BCryptPasswordEncoder();
    }
}
