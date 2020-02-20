package com.spring.test.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.test.model.Server;

public interface ServerRepository extends MongoRepository<Server,Integer>{


	List<Server> findServerByName(String a);
	
	String deleteById(int a);


}
