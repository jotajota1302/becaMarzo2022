package edu.es.eoi.userrestexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)	
	public @ResponseBody List<User> findAll() {
		
		return service.findAll();
		
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)	
	public @ResponseBody User findById(@PathVariable Integer id) {
		
		return service.findById(id);
		
	}

}
