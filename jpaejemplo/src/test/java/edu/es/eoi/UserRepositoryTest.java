package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.UserRepository;

class UserRepositoryTest {

	@Test
	void test() {
	
		UserRepository repository= new UserRepository();
		
		User user=repository.getUser(1);
		
		Assertions.assertEquals("JJ", user.getName());
	}

}