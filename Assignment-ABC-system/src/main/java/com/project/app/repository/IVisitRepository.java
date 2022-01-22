package com.project.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.app.model.User;
import com.project.app.model.Visit;


@Repository
public interface IVisitRepository extends CrudRepository<Visit, Integer> {
	
	//get Visit By Id
			public List<Visit> findByVisitId(Integer id);
			
			public List<Visit> findByempId(Integer id);
			
			public List<User> findBycustName(String custName);


}
