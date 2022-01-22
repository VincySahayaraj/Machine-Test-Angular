package com.project.app.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.app.model.User;


@Repository
public interface IUserRepository  extends CrudRepository<User, Integer>  {
	
	    //getUserByName
		public List<User> findByEmpId(Integer id);
		
		public List<User> findBylId(Integer id);
		
		public List<User> findByFirstName(String firstName);

		// custom query Method
		@Query("From User WHERE firstName=?1 AND lastName=?2")
		User findByFirstNameAndLastName(String firstName, String lastName);
//
//		@Query("FROM User WHERE isActive='Y'")
//		List<User> listUser();
//
//		@Modifying
//		@Query("UPDATE User SET isActive='N' WHERE empId=?1")
//		void save(Integer id);

}
