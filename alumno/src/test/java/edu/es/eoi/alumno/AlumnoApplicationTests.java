package edu.es.eoi.alumno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlumnoApplicationTests {

	@Autowired
	AlumnoController controller;
	
	@Test
	void contextLoads() {
		
		System.out.println(controller.getNombreAlumnoById(1));
	}

}
