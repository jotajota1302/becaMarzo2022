package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the forma_evolucion database table.
 * 
 */
@Entity
@Table(name="forma_evolucion")
@NamedQuery(name="FormaEvolucion.findAll", query="SELECT f FROM FormaEvolucion f")
public class FormaEvolucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_evolucion", unique=true, nullable=false)
	private int idFormaEvolucion;

	//bi-directional many-to-one association to TipoEvolucion
	@ManyToOne
	@JoinColumn(name="tipo_evolucion", nullable=false)
	private TipoEvolucion tipoEvolucionBean;

	//bi-directional one-to-one association to NivelEvolucion
	@OneToOne(mappedBy="formaEvolucion")
	private NivelEvolucion nivelEvolucion;

	//bi-directional one-to-one association to Piedra
	@OneToOne(mappedBy="formaEvolucion")
	private Piedra piedra;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany(mappedBy="formaEvolucions")
	private List<Pokemon> pokemons;

	public FormaEvolucion() {
	}

	public int getIdFormaEvolucion() {
		return this.idFormaEvolucion;
	}

	public void setIdFormaEvolucion(int idFormaEvolucion) {
		this.idFormaEvolucion = idFormaEvolucion;
	}

	public TipoEvolucion getTipoEvolucionBean() {
		return this.tipoEvolucionBean;
	}

	public void setTipoEvolucionBean(TipoEvolucion tipoEvolucionBean) {
		this.tipoEvolucionBean = tipoEvolucionBean;
	}

	public NivelEvolucion getNivelEvolucion() {
		return this.nivelEvolucion;
	}

	public void setNivelEvolucion(NivelEvolucion nivelEvolucion) {
		this.nivelEvolucion = nivelEvolucion;
	}

	public Piedra getPiedra() {
		return this.piedra;
	}

	public void setPiedra(Piedra piedra) {
		this.piedra = piedra;
	}

	public List<Pokemon> getPokemons() {
		return this.pokemons;
	}

	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

}