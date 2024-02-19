package com.inn.cafe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.inn.cafe.model.User;
import com.inn.cafe.wrapper.UserWrapper;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmailId(@Param("email") String email);
	
	List<UserWrapper> getAllUsers();

	@Transactional
	@Modifying
	Integer updateStatus(@Param("status") String status, @Param("id") Integer id);

	List<String> getAllAdmin();
	
}
