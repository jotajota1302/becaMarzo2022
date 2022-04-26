package edu.es.eoi.userrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;	
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
}
