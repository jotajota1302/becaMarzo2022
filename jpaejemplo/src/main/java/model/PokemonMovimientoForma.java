package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pokemon_movimiento_forma database table.
 * 
 */
@Entity
@Table(name="pokemon_movimiento_forma")
@NamedQuery(name="PokemonMovimientoForma.findAll", query="SELECT p FROM PokemonMovimientoForma p")
public class PokemonMovimientoForma implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PokemonMovimientoFormaPK id;

	//bi-directional many-to-one association to Pokemon
	@ManyToOne
	@JoinColumn(name="numero_pokedex", nullable=false, insertable=false, updatable=false)
	private Pokemon pokemon;

	//bi-directional many-to-one association to Movimiento
	@ManyToOne
	@JoinColumn(name="id_movimiento", nullable=false, insertable=false, updatable=false)
	private Movimiento movimiento;

	//bi-directional many-to-one association to FormaAprendizaje
	@ManyToOne
	@JoinColumn(name="id_forma_aprendizaje", nullable=false, insertable=false, updatable=false)
	private FormaAprendizaje formaAprendizaje;

	public PokemonMovimientoForma() {
	}

	public PokemonMovimientoFormaPK getId() {
		return this.id;
	}

	public void setId(PokemonMovimientoFormaPK id) {
		this.id = id;
	}

	public Pokemon getPokemon() {
		return this.pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Movimiento getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public FormaAprendizaje getFormaAprendizaje() {
		return this.formaAprendizaje;
	}

	public void setFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		this.formaAprendizaje = formaAprendizaje;
	}

}