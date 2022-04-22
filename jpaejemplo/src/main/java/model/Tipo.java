package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo database table.
 * 
 */
@Entity
@Table(name="tipo")
@NamedQuery(name="Tipo.findAll", query="SELECT t FROM Tipo t")
public class Tipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo", unique=true, nullable=false)
	private int idTipo;

	@Column(nullable=false, length=10)
	private String nombre;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="tipo")
	private List<Movimiento> movimientos;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany(mappedBy="tipos")
	private List<Pokemon> pokemons;

	//bi-directional many-to-one association to TipoAtaque
	@ManyToOne
	@JoinColumn(name="id_tipo_ataque", nullable=false)
	private TipoAtaque tipoAtaque;

	public Tipo() {
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setTipo(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setTipo(null);

		return movimiento;
	}

	public List<Pokemon> getPokemons() {
		return this.pokemons;
	}

	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public TipoAtaque getTipoAtaque() {
		return this.tipoAtaque;
	}

	public void setTipoAtaque(TipoAtaque tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}

}