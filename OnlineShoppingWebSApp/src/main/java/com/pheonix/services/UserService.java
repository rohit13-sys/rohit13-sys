package com.pheonix.services;

import java.util.List;

import com.pheonix.entity.User;
import com.pheonix.exception.UserNotFoundException;

public interface UserService {

	User findByUserName(String userName) throws UserNotFoundException;

	List<User> findAllUsers();

	void addUser(User user);

	void edit(User user);

	void remove(User user);
}
