package edu.es.eoi.h2example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> findById(@PathVariable Integer id) {
		
		return ResponseEntity.ok(service.findById(id));

	}

	@RequestMapping(method = RequestMethod.GET, value = "/saluda1")
	public String saluda() {
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/saluda2")
	public ResponseEntity<String> saludaEntity() {
		return new ResponseEntity<>("hello", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/saluda3")
	public ResponseEntity<String> getNombre(@RequestParam(value = "name") String name) {
		return new ResponseEntity<>("hello".concat(" ").concat(name), HttpStatus.OK);
	}

}
