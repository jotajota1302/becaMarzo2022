package edu.es.eoi.userrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAll() {

		return service.findAll();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable Integer id) {

		return service.findById(id);

	}

	@RequestMapping(method = RequestMethod.POST)
	public String create(@RequestBody User user) {

		service.create(user);
		return "user created";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)	
	public String update(@RequestBody User user, @PathVariable Integer id) {

		if (user.getId() != id) {
			return "datos incorrectos";
		} else {
			service.update(user);
			return "user updated";
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteById(@PathVariable Integer id) {

		service.delete(id);
		return "user deleted";
	}



}
