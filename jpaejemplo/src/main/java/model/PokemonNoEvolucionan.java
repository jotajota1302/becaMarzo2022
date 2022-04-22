package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pokemon_no_evolucionan database table.
 * 
 */
@Entity
@Table(name="pokemon_no_evolucionan")
@NamedQuery(name="PokemonNoEvolucionan.findAll", query="SELECT p FROM PokemonNoEvolucionan p")
public class PokemonNoEvolucionan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=15)
	private String nombre;

	@Column(name="numero_pokedex", nullable=false)
	private int numeroPokedex;

	public PokemonNoEvolucionan() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPokedex() {
		return this.numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

}