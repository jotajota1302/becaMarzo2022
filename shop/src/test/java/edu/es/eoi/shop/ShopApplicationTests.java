package edu.es.eoi.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.shop.entities.Customer;
import edu.es.eoi.shop.entities.User;
import edu.es.eoi.shop.repositories.CustomerRepository;
import edu.es.eoi.shop.repositories.UserRepository;

@SpringBootTest
class ShopApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	void contextLoads() {
		
		User user=new User();
		user.setEmail("test@mail.com");
		user.setPassword("abcdefg");
		
//		userRepository.save(user);
		
		user=userRepository.findById("test@mail.com").get();
		
		Customer customer= new Customer();
		customer.setCustomerPhone("61989382");
		customer.setUser(user);	
		
//		customerRepository.save(customer);
		
		
	}

}
