package com.project.app.service;

import java.util.List;
import java.util.Optional;
import com.project.app.model.Login;

public interface ILoginService {

	// Get Login By User Id
	public Optional<Login> findBylId(Integer id);

	// get login details UserByName
	public List<Login> findByUserName(String userName);

	// getUserByName and password
	public Login findByUserNameAndPassword(String userName, String password);

}
