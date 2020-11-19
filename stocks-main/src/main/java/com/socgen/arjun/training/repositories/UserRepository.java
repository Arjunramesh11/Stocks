package com.socgen.arjun.training.repositories;

import java.util.List;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socgen.arjun.training.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
	@Query(nativeQuery = true, value = "select * from User")List<User> searchUser();
	
}
