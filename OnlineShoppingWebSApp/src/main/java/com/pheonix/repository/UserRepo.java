package com.pheonix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pheonix.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

	

}
