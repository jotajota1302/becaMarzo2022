package edu.es.eoi.alumno;

import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository {
		
	@Override
	public String selectAlumnoById(int id) {
		
		System.out.println("accedo a bbdd desde el repositorio y busco el alumno: " + id);			
				
		return "Hello";
	}
	

	
}
