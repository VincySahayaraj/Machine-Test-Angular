package com.project.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.app.model.Login;

@Repository
public interface ILoginRepository  extends CrudRepository<Login, Integer>{
	
	
	    // get Login by id
		public List<Login> findBylId(Integer id);

		// get Login by user name
		public List<Login> findByUserName(String userName);

		// custom query Method
		@Query("From User WHERE userName=?1 AND password=?2")
		Login findByUserNameAndPassword(String userName, String password);

		

}
