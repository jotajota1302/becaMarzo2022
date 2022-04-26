package edu.es.eoi.myfirstcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getHome() {
		return "hello world from get";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String postHome() {
		return "hello world from post";
	}

}
