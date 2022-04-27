package edu.es.eoi.h2example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class H2exampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2exampleApplication.class, args);
	}

}
