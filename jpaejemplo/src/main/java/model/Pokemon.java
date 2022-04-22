package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pokemon database table.
 * 
 */
@Entity
@Table(name="pokemon")
@NamedQuery(name="Pokemon.findAll", query="SELECT p FROM Pokemon p")
public class Pokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numero_pokedex", unique=true, nullable=false)
	private int numeroPokedex;

	@Column(nullable=false)
	private double altura;

	@Column(nullable=false, length=15)
	private String nombre;

	@Column(nullable=false)
	private double peso;

	//bi-directional one-to-one association to EstadisticasBase
	@OneToOne(mappedBy="pokemon")
	private EstadisticasBase estadisticasBase;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany
	@JoinTable(
		name="evoluciona_de"
		, joinColumns={
			@JoinColumn(name="pokemon_origen", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="pokemon_evolucionado", nullable=false)
			}
		)
	private List<Pokemon> pokemons1;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany(mappedBy="pokemons1")
	private List<Pokemon> pokemons2;

	//bi-directional many-to-many association to FormaEvolucion
	@ManyToMany
	@JoinTable(
		name="pokemon_forma_evolucion"
		, joinColumns={
			@JoinColumn(name="numero_pokedex", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_forma_evolucion", nullable=false)
			}
		)
	private List<FormaEvolucion> formaEvolucions;

	//bi-directional many-to-one association to PokemonMovimientoForma
	@OneToMany(mappedBy="pokemon")
	private List<PokemonMovimientoForma> pokemonMovimientoFormas;

	//bi-directional many-to-many association to Tipo
	@ManyToMany
	@JoinTable(
		name="pokemon_tipo"
		, joinColumns={
			@JoinColumn(name="numero_pokedex", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_tipo", nullable=false)
			}
		)
	private List<Tipo> tipos;

	public Pokemon() {
	}

	public int getNumeroPokedex() {
		return this.numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public EstadisticasBase getEstadisticasBase() {
		return this.estadisticasBase;
	}

	public void setEstadisticasBase(EstadisticasBase estadisticasBase) {
		this.estadisticasBase = estadisticasBase;
	}

	public List<Pokemon> getPokemons1() {
		return this.pokemons1;
	}

	public void setPokemons1(List<Pokemon> pokemons1) {
		this.pokemons1 = pokemons1;
	}

	public List<Pokemon> getPokemons2() {
		return this.pokemons2;
	}

	public void setPokemons2(List<Pokemon> pokemons2) {
		this.pokemons2 = pokemons2;
	}

	public List<FormaEvolucion> getFormaEvolucions() {
		return this.formaEvolucions;
	}

	public void setFormaEvolucions(List<FormaEvolucion> formaEvolucions) {
		this.formaEvolucions = formaEvolucions;
	}

	public List<PokemonMovimientoForma> getPokemonMovimientoFormas() {
		return this.pokemonMovimientoFormas;
	}

	public void setPokemonMovimientoFormas(List<PokemonMovimientoForma> pokemonMovimientoFormas) {
		this.pokemonMovimientoFormas = pokemonMovimientoFormas;
	}

	public PokemonMovimientoForma addPokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().add(pokemonMovimientoForma);
		pokemonMovimientoForma.setPokemon(this);

		return pokemonMovimientoForma;
	}

	public PokemonMovimientoForma removePokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().remove(pokemonMovimientoForma);
		pokemonMovimientoForma.setPokemon(null);

		return pokemonMovimientoForma;
	}

	public List<Tipo> getTipos() {
		return this.tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

}