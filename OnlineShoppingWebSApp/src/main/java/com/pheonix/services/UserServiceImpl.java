package com.pheonix.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pheonix.entity.User;
import com.pheonix.exception.UserNotFoundException;
import com.pheonix.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public User findByUserName(String userName) throws UserNotFoundException {
		/*
		 * Optional<User> user = userRepo.findById(userName); if (user.isPresent())
		 * return user.get(); else throw new UserNotFoundException("User not found");
		 */

		return userRepo.findById(userName)
				.orElseThrow(() -> new UserNotFoundException("User " + userName + " not found"));
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public void addUser(User user) {
		userRepo.save(user);

	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		Optional<User> op = userRepo.findById(user.getUsername());
		if (op.isPresent())
			userRepo.save(user);
		else
			System.out.println("Sorry!User not found");

	}

	@Override
	public void remove(User user) {
		Optional<User> op = userRepo.findById(user.getUsername());
		if (op.isPresent())
			userRepo.delete(user);
		else
			System.out.println("Sorry!User not found");

	}

}
