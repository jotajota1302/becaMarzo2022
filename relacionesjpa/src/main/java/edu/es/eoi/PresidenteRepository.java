package edu.es.eoi;

public class PresidenteRepository extends AbstractUpdateRepository<Presidente>{

	public Presidente read(int id) {

		return entityManager.find(Presidente.class, id);

	}

}
