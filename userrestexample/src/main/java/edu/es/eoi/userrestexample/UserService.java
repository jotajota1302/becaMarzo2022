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
	
	public User findById(int id) {
		
		User user=repository.findById(id).get();
		user.setPassword("***********");
		
		return user;
	}
	
	public void create(User user) {
		
		repository.save(user);		
		
	}
	
	public void update(User user) {
		
		repository.save(user);		
		
	}
	
	public void delete(int id) {
		
		repository.deleteById(id);	
		
	}
	
}
