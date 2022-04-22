package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estadisticas_base database table.
 * 
 */
@Entity
@Table(name="estadisticas_base")
@NamedQuery(name="EstadisticasBase.findAll", query="SELECT e FROM EstadisticasBase e")
public class EstadisticasBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numero_pokedex", unique=true, nullable=false)
	private int numeroPokedex;

	@Column(nullable=false)
	private int ataque;

	@Column(nullable=false)
	private int defensa;

	@Column(nullable=false)
	private int especial;

	@Column(nullable=false)
	private int ps;

	@Column(nullable=false)
	private int velocidad;

	//bi-directional one-to-one association to Pokemon
	@OneToOne
	@JoinColumn(name="numero_pokedex", nullable=false, insertable=false, updatable=false)
	private Pokemon pokemon;

	public EstadisticasBase() {
	}

	public int getNumeroPokedex() {
		return this.numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public int getAtaque() {
		return this.ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return this.defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getEspecial() {
		return this.especial;
	}

	public void setEspecial(int especial) {
		this.especial = especial;
	}

	public int getPs() {
		return this.ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public Pokemon getPokemon() {
		return this.pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

}