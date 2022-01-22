package com.project.app.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.app.model.User;
import com.project.app.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	// Get Instance --IoC
	@Autowired
	private IUserService userService;

	// Http Methods

	// Get All User
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	// get User By Id
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	// get user by name and password
	@GetMapping("/users/{firstName}&{lastName}")
	public ResponseEntity<User> findByUserNameAndLastName(@PathVariable String firstName,
			@PathVariable String lastName) {
		ResponseEntity<User> response = null;
		User user = userService.findByFirstNameAndLastName(firstName, lastName);
		if (user == null) {
			response = new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(user, HttpStatus.OK);
		}

		return response;
	}

	// Post --Insert User
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);

	}

	// Put --Update User
	@PutMapping("/users")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	// Delete --Delete user
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteById(id);

	}

}
