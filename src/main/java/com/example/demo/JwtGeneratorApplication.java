package com.example.demo;

// import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// import com.example.demo.entities.Role;
// import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@SpringBootApplication
public class JwtGeneratorApplication {

	@Autowired
	UserService userService;

	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtGeneratorApplication.class, args);
	}

	// @PostConstruct
	// void init_users() {
	// // Creating roles
	// userService.addRole(new Role(null, "ADMIN"));
	// userService.addRole(new Role(null, "USER"));

	// // Creating users
	// userService.saveUser(new User(null, "Admin", "123", true, null));
	// userService.saveUser(new User(null, "Sina", "123", true, null));
	// userService.saveUser(new User(null, "John", "123", true, null));

	// // Adding roles to users
	// userService.addRoleToUser("Admin", "ADMIN");
	// userService.addRoleToUser("Admin", "USER");
	// userService.addRoleToUser("Sina", "USER");
	// userService.addRoleToUser("John", "USER");
	// }

}
