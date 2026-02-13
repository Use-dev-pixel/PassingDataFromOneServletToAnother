package org.jsp.second_spring.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.second_spring.dto.User;
import org.jsp.second_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		User savedUser = repository.save(user);
		return savedUser;
	}

	public Optional<User> getUserById(int id) {
		Optional<User> user = repository.findById(id);
		return user;

	}

	public User login(String email) {
		User user = repository.login(email);
		return user;
	}
	
	public void deleteUser(User user) {
		repository.delete(user);
	}
	
	public User updateUser(User user) {
		return repository.save(user);
	}
	
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
}
