package com.project.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.model.User;
import com.project.app.repository.IUserRepository;

@Service
public class UserServiceImplementation implements IUserService {

	// IoC
	@Autowired
	private IUserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);

	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);

	}

	@Override
	public User findByFirstNameAndLastName(String firstName, String lastName) {

		return userRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);

	}

}
