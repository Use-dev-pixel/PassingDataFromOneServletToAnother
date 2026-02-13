package org.jsp.second_spring.service;

import java.util.List;

import org.jsp.second_spring.dao.UserDao;
import org.jsp.second_spring.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao dao;

	public User saveUser(User user) {
		// validation
		if (dao.getUserById(user.getId()).isPresent()) {
			throw new RuntimeException("User is already present with given id");
		}

		User savedUser = dao.saveUser(user);
		return savedUser;
	}

	public User getUserById(int id) {
//		Optional<User> user=repository.findById(id);
//		if (user.isPresent()) {
//			return user.get();
//		}
//		throw new RuntimeException("UserNotFoundException");

		User user = dao.getUserById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
		return user;
	}
	
	public boolean login(String email,String password) {
		User user=dao.login(email);
		if (user != null && user.getPassword().equals(password)) {
			return true;
		}
		throw new RuntimeException("invalid credentials");
		
	}
	
	public void deleteUser(User user) {
		dao.deleteUser(user);
	}
	public User updateUser(User user) {
		return dao.updateUser(user);
	}
	
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}
}
