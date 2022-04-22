package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the forma_aprendizaje database table.
 * 
 */
@Entity
@Table(name="forma_aprendizaje")
@NamedQuery(name="FormaAprendizaje.findAll", query="SELECT f FROM FormaAprendizaje f")
public class FormaAprendizaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_aprendizaje", unique=true, nullable=false)
	private int idFormaAprendizaje;

	//bi-directional many-to-one association to TipoFormaAprendizaje
	@ManyToOne
	@JoinColumn(name="id_tipo_aprendizaje", nullable=false)
	private TipoFormaAprendizaje tipoFormaAprendizaje;

	//bi-directional one-to-one association to Mo
	@OneToOne(mappedBy="formaAprendizaje")
	private Mo mo;

	//bi-directional one-to-one association to Mt
	@OneToOne(mappedBy="formaAprendizaje")
	private Mt mt;

	//bi-directional one-to-one association to NivelAprendizaje
	@OneToOne(mappedBy="formaAprendizaje")
	private NivelAprendizaje nivelAprendizaje;

	//bi-directional many-to-one association to PokemonMovimientoForma
	@OneToMany(mappedBy="formaAprendizaje")
	private List<PokemonMovimientoForma> pokemonMovimientoFormas;

	public FormaAprendizaje() {
	}

	public int getIdFormaAprendizaje() {
		return this.idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public TipoFormaAprendizaje getTipoFormaAprendizaje() {
		return this.tipoFormaAprendizaje;
	}

	public void setTipoFormaAprendizaje(TipoFormaAprendizaje tipoFormaAprendizaje) {
		this.tipoFormaAprendizaje = tipoFormaAprendizaje;
	}

	public Mo getMo() {
		return this.mo;
	}

	public void setMo(Mo mo) {
		this.mo = mo;
	}

	public Mt getMt() {
		return this.mt;
	}

	public void setMt(Mt mt) {
		this.mt = mt;
	}

	public NivelAprendizaje getNivelAprendizaje() {
		return this.nivelAprendizaje;
	}

	public void setNivelAprendizaje(NivelAprendizaje nivelAprendizaje) {
		this.nivelAprendizaje = nivelAprendizaje;
	}

	public List<PokemonMovimientoForma> getPokemonMovimientoFormas() {
		return this.pokemonMovimientoFormas;
	}

	public void setPokemonMovimientoFormas(List<PokemonMovimientoForma> pokemonMovimientoFormas) {
		this.pokemonMovimientoFormas = pokemonMovimientoFormas;
	}

	public PokemonMovimientoForma addPokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().add(pokemonMovimientoForma);
		pokemonMovimientoForma.setFormaAprendizaje(this);

		return pokemonMovimientoForma;
	}

	public PokemonMovimientoForma removePokemonMovimientoForma(PokemonMovimientoForma pokemonMovimientoForma) {
		getPokemonMovimientoFormas().remove(pokemonMovimientoForma);
		pokemonMovimientoForma.setFormaAprendizaje(null);

		return pokemonMovimientoForma;
	}

}