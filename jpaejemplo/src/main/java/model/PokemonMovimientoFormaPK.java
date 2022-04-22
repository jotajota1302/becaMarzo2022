package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pokemon_movimiento_forma database table.
 * 
 */
@Embeddable
public class PokemonMovimientoFormaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numero_pokedex", insertable=false, updatable=false, unique=true, nullable=false)
	private int numeroPokedex;

	@Column(name="id_movimiento", insertable=false, updatable=false, unique=true, nullable=false)
	private int idMovimiento;

	@Column(name="id_forma_aprendizaje", insertable=false, updatable=false, unique=true, nullable=false)
	private int idFormaAprendizaje;

	public PokemonMovimientoFormaPK() {
	}
	public int getNumeroPokedex() {
		return this.numeroPokedex;
	}
	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}
	public int getIdMovimiento() {
		return this.idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public int getIdFormaAprendizaje() {
		return this.idFormaAprendizaje;
	}
	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PokemonMovimientoFormaPK)) {
			return false;
		}
		PokemonMovimientoFormaPK castOther = (PokemonMovimientoFormaPK)other;
		return 
			(this.numeroPokedex == castOther.numeroPokedex)
			&& (this.idMovimiento == castOther.idMovimiento)
			&& (this.idFormaAprendizaje == castOther.idFormaAprendizaje);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.numeroPokedex;
		hash = hash * prime + this.idMovimiento;
		hash = hash * prime + this.idFormaAprendizaje;
		
		return hash;
	}
}