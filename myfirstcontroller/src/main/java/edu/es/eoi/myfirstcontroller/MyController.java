package edu.es.eoi.myfirstcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getHome(@RequestParam String nombre,@RequestParam String apellidos) {
		return "hello world from get, you are: " + nombre+", " + apellidos;
	}
	
	@RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
	public @ResponseBody String getHome(@PathVariable Integer id) {
		return "hello world from get, you are: " + id;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String postHome() {
		return "hello world from post";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody String putHome() {
		return "hello world from put";
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public @ResponseBody String deleteHome() {
		return "hello world from delete";
	}

}
