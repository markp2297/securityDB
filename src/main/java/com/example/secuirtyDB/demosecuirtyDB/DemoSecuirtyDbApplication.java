package com.example.secuirtyDB.demosecuirtyDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class DemoSecuirtyDbApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSecuirtyDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User("mark","$2a$10$DND3y7LgFqJ1DgYo8ZbLkeXUKAiPU4qkmhnw/E2XlckWR/FTs9doS",true,"admin:student");
		User user1 = new User("mark5","$2a$10$SLEJb2P7vcBc6sQjz7OQY.TyCdxGpj06tpDjAn/rk.zKUb16hgUAG/E2XlckWR/FTs9doS",true,"student");

		userRepository.save(user);
		userRepository.save(user1);

	}
}
