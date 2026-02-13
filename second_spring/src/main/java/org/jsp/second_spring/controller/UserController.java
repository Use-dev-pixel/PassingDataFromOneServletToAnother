package org.jsp.second_spring.controller;

import java.util.List;

import org.jsp.second_spring.dto.User;
import org.jsp.second_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {

		User savedUser = service.saveUser(user);
		return savedUser;
	}

	@GetMapping("/find/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@GetMapping("/login")
	public boolean login(@RequestParam String email, String password) {
		return service.login(email, password);
	}

	@DeleteMapping("/delete")
	public void deleteUser(@RequestBody User user) {
		service.deleteUser(user);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		 return service.updateUser(user);
	}
	@GetMapping("/find_all")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
}
