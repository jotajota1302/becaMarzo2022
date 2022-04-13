package edu.es.eoi;

public class EquipoRepository extends AbstractUpdateRepository<Equipo>{
	
	public Equipo read(int id) {
		
		return entityManager.find(Equipo.class,id);
				
	}
	
}
