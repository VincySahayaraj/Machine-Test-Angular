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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.app.model.Login;
import com.project.app.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

	// Get Instance --IoC
	@Autowired
	private ILoginService loginService;

	// get User By Id
	@GetMapping("/login/{id}")
	public Optional<Login> findBylId(@PathVariable Integer id) {
		return loginService.findBylId(id);
	}

	// get user by name and password
	@GetMapping("/login/{userName}&{password}")
	public ResponseEntity<Login> findByUserNameAndPassword(@PathVariable String userName,
			@PathVariable String password) {
		ResponseEntity<Login> response = null;
		Login login = loginService.findByUserNameAndPassword(userName, password);
		if (login == null) {
			response = new ResponseEntity<>(login, HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(login, HttpStatus.OK);
		}

		return response;
	}

}