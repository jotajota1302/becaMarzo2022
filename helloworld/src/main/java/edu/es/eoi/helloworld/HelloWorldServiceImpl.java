package edu.es.eoi.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

	@Autowired
	HelloWorldRepository repository;
	
	@Override
	public String helloWorld() {
		
		return repository.helloWorld();
	}

}
