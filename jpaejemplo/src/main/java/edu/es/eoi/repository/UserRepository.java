package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.User;



public class UserRepository {
	
	public EntityManager entityManager=Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
	
	public User getUser(int id) {
				
		return entityManager.find(User.class,id);
		
	}

}
