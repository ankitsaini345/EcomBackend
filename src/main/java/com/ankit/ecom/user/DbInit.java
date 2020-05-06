package com.ankit.ecom.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ankit.ecom.product.repository.ProductRepository;

public class DbInit implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(DbInit.class);
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("inside db inside db inside db");
		
//		userRepo.save(new User("Ankit", "ankit345", passwordEncoder.encode("passwd"),"ankitsaini345@gmail.com", "ADMIN"));
//		userRepo.save(new User("test", "test345", passwordEncoder.encode("testpass"),"test345@gmail.com", "USER"));	
	}

}
