package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EquipoRepository {
	
	public EntityManager entityManager = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
	
	//CRUD

	public Equipo readEquipo(int id) {
		
		return entityManager.find(Equipo.class,id);
				
	}
	
	public void createEquipo(Equipo equipo) {
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(equipo);
		
		entityManager.getTransaction().commit();
				
	}
}
