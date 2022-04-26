package edu.es.eoi.myfirstcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/*")
public class MyController {

	@RequestMapping("home")
	public @ResponseBody String home() {
		return "hello world";
	}

	@RequestMapping("index")
	public String index() {
		return "index.html";
	}

}
