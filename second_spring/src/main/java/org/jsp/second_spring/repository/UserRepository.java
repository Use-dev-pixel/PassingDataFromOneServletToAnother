package org.jsp.second_spring.repository;

import org.jsp.second_spring.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
//https://tinyurl.com/J2EE-Files
	
	@Query("SELECT u FROM User u WHERE u.email=?1")
	public User login(String email);
}
