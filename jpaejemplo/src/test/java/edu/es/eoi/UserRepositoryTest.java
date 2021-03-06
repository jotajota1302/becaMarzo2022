package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

class UserRepositoryTest {

	@Test
	void test() {
	
		UserRepository repository= new UserRepository();
		
		User user=repository.readUser(1);
		
		Assertions.assertEquals("JJ", user.getName());
		
		User newUser=new User();		
		newUser.setName("test");
		newUser.setSurname("surnametest");
			
		repository.createUser(newUser);
		
		newUser.setSurname("Jimenez Rodriguez");
		repository.updateUser(newUser);
		
		repository.deleteUser(newUser);
	}

}
