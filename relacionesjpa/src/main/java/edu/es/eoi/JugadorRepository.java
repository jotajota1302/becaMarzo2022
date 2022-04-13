package edu.es.eoi;

public class JugadorRepository extends AbstractUpdateRepository<Jugador> {

	
	public Jugador read(int id) {
		
		return entityManager.find(Jugador.class, id);

	}

}
