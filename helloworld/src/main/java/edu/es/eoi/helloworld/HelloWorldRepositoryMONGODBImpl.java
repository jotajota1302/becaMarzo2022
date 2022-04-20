package edu.es.eoi.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class HelloWorldRepositoryMONGODBImpl implements HelloWorldRepository {

	@Override
	public String helloWorld() {

		return "acceso a bbdd con MONGO DB";
	}
	
	
}
