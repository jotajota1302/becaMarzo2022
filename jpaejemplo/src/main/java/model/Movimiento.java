package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the movimiento database table.
 * 
 */
@Entity
@Table(name="movimiento")
@NamedQuery(name="Movimiento.findAll", query="SELECT m FROM Movimiento m")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_movimiento", unique=true, nullable=false)
	private int idMovimiento;

	@Column(nullable=false, length=500)
	private String descripcion;

	@Column(nullable=false, length=20)
	private String nombre;

	@Column(nullable=false)
	private int potencia;

	@Column(nullable=false)
	private int pp;

	@Column(name="precision_mov", nullable=false)
	private int precisionMov;

	@Column(nullable=false)
	private int prioridad;

	//bi-directional many-to-one association to Tipo
	@ManyToOne
	@JoinColumn(name="id_tipo", nullable=false)
	private Tipo tipo;

	//bi-directional many-to-one association to MovimientoEfectoSecundario
	@OneToMany(mappedBy="movimiento")
	private List<MovimientoEfectoSecundario> movimientoEfectoSecundarios;

	//bi-directional many-to-one association to PokemonMovimientoForma
	@OneToMany(mappedBy="movimiento")
	private List<PokemonMovimientoForma> pokemonMovimientoFormas;

	public Movimiento() {
	}

	public int getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPp() {
		return this.pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getPrecisionMov() {
		return this.precisionMov;
	}

	public void setPrecisionMov(int precisionMov) {
		this.precisionMov = precisionMov;
	}

	public int getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public List<MovimientoEfectoSecundario> getMovimientoEfectoSecundarios() {
		return this.movimientoEfectoSecundarios;
	}

	public void setMovimientoEfectoSecundarios(List<MovimientoEfectoSecundario> movimientoEfectoSecundarios) {
		this.movimientoEfectoSecundarios = movimientoEfectoSecundarios;
	}

	public MovimientoEfectoSecundario addMovimientoEfectoSecundario(MovimientoEfectoSecundario movimientoEfectoSecundario) {
		getMovimientoEfectoSecundarios().add(movimientoEfectoSecundario);
		movimientoEfectoSecundario.setMovimiento(this);

		return movimientoEfectoSecundario;
	}

	public MovimientoEfectoSecundario removeMovimientoEfectoSecundario(MovimientoEfectoSecundario movimientoEfectoSecundario) {
		getMovimientoEfectoSecundarios().remove(movimientoEfectoSecundario);
		movimientoEfectoSecundario.setMovimiento(null);

		return movimientoEfectoSecundario;
	}

	public List<PokemonMovimientoForma> getPokemonMovimientoFormas() {
		return this.pokemonMovimientoFormas;
	}

	public void setPokemonMovimientoFormas(List<PokemonMovimientoForma> pokemonMovimientoFormas) {
		this.pokemonMovimientoFormas = pokemonMovimientoFormas;
	}

	public PokemonMovimientoForma addPokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().add(pokemonMovimientoForma);
		pokemonMovimientoForma.setMovimiento(this);

		return pokemonMovimientoForma;
	}

	public PokemonMovimientoForma removePokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().remove(pokemonMovimientoForma);
		pokemonMovimientoForma.setMovimiento(null);

		return pokemonMovimientoForma;
	}

}