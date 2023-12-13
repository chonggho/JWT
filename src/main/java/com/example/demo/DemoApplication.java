package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepository.findByRole(Role.admin);
		if (null == adminAccount) {
			User user = new User();

			user.setEmail("admin@gmail.com");
			user.setNickname("admin");
			user.setRole(Role.admin);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		} else {
			User user = new User();

			user.setEmail("user@gmail.com");
			user.setNickname("user");
			user.setRole(Role.user);
			user.setPassword(new BCryptPasswordEncoder().encode("user"));
			userRepository.save(user);
		}
	}
}
