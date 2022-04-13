package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class AbstractUpdateRepository<ENTITY> {

	public EntityManager entityManager = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
			
	public void create(ENTITY entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(entity);
		
		entityManager.getTransaction().commit();
				
	}
	
	public void update(ENTITY entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
				
	}
	
	public void delete(ENTITY entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(entity);
		
		entityManager.getTransaction().commit();
				
	}
	
}
