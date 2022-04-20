package edu.es.eoi.alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
		
	public String getNombreAlumnoById(int id) {
		
		System.out.println("entro al controller e invoco al servicio");
		
		return service.findNombreAlumnoById(id);
	}

}
