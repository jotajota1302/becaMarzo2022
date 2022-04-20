package edu.es.eoi.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldRepositoryJPAImpl implements HelloWorldRepository {

	@Override
	public String helloWorld() {

		return "acceso a bbdd con JPA";
	}
	
	
}
