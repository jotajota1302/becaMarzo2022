package edu.es.eoi.controller;

import java.sql.SQLException;

import edu.es.eoi.entity.User;
import edu.es.eoi.service.UserService;

public class UserController {
		
	//"1-LOGIN"	
	private UserService userService= new UserService();
	
	public User login(String user,String password) {
			
		User temp = null;
		
		try {
			temp= userService.getUser(user, password);
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	
		return temp;
	}

}
