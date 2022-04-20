package edu.es.eoi.alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	AlumnoRepository repository;
	
	@Override
	public String findNombreAlumnoById(int id) {
	
		System.out.println("entro al servicio y llamo al repository");
		
		return repository.selectAlumnoById(id);
		
	}

}
