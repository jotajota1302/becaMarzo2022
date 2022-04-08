package edu.es.eoi.service;

import java.sql.SQLException;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

public class UserService {

	private UserRepository repository=new UserRepository();	
	
	public User getUser(String mail, String password) throws SQLException {
		
		return repository.getUser(mail, password);
	}

	public boolean exists(String email) throws SQLException {
		
		 return repository.exists(email);		

	}
	
	public User getUserByEmail(String email) throws SQLException {		
		
		return repository.getUserByEmail(email);

	}
	
	public boolean create(User user) throws SQLException {

		return repository.create(user);
		
	}

	public boolean updateLastAcess(String email) throws SQLException {

	 return repository.updateLastAcess(email);
		
	}
}
