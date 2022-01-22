package com.project.app.service;

import java.util.List;
import java.util.Optional;
import com.project.app.model.User;

public interface IUserService {

	// Get All User
	public List<User> getAllUser();

	// Get User By Id
	public Optional<User> getUserById(Integer id);

	// Insert
	public void addUser(User user);

	// Update
	public void updateUser(User user);

	// Delete User
	public void deleteById(Integer id);

	// getUserByName and password
	public User findByFirstNameAndLastName(String firstName, String lastName);

}
