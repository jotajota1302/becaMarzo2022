package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EquipoRepository {
	
	public EntityManager entityManager = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
	
	//CRUD

	
}
