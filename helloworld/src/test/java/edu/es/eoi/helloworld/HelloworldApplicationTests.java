package edu.es.eoi.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	HelloWorldService service;
	
	@Test
	void contextLoads() {
		
		System.out.println(service.helloWorld());
		
	}

}
