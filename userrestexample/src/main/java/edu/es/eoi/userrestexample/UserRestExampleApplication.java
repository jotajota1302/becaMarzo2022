package edu.es.eoi.userrestexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class UserRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestExampleApplication.class, args);
	}

}
