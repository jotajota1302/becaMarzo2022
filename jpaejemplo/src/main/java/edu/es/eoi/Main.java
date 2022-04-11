package edu.es.eoi;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

public class Main {

	public static void main(String[] args) {
		
		UserRepository repository= new UserRepository();
		
		User user=repository.getUser(1);		
		
		System.out.println(user.getEmail());

	}

}
