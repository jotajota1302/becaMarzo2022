package edu.es.eoi.h2example;

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
	
	public UserDto findById(int id) {
		
		User user=repository.findById(id).get();
			
		UserDto dto=new UserDto();
		dto.setId(user.getId());
		dto.setMail(user.getEmail());
		dto.setSubscription(user.getSubscription().getTipo());
				
		
		return dto;
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
