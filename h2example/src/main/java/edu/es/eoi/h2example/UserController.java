package edu.es.eoi.h2example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> sayHello() {

		return ResponseEntity.ok("Ha ido bien");
	}

	@RequestMapping(value = "/bye", method = RequestMethod.GET)
	public ResponseEntity<String> sayBye() {

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {

		return ResponseEntity.ok(service.findAll());

	}

}
