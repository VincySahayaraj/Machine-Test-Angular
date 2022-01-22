package com.project.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.app.model.Login;
import com.project.app.repository.ILoginRepository;

@Service
public class LoginServiceImplementation implements ILoginService {

	// IoC
	@Autowired
	private ILoginRepository loginRepository;

	@Override
	public Optional<Login> findBylId(Integer id) {

		return loginRepository.findById(id);
	}

	@Override
	public List<Login> findByUserName(String userName) {

		return loginRepository.findByUserName(userName);
	}

	@Override
	public Login findByUserNameAndPassword(String userName, String password) {

		return loginRepository.findByUserNameAndPassword(userName, password);
	}

}
