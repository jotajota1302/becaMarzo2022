package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_ataque database table.
 * 
 */
@Entity
@Table(name="tipo_ataque")
@NamedQuery(name="TipoAtaque.findAll", query="SELECT t FROM TipoAtaque t")
public class TipoAtaque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_ataque", unique=true, nullable=false)
	private int idTipoAtaque;

	@Column(nullable=false, length=8)
	private String tipo;

	//bi-directional many-to-one association to Tipo
	@OneToMany(mappedBy="tipoAtaque")
	private List<Tipo> tipos;

	public TipoAtaque() {
	}

	public int getIdTipoAtaque() {
		return this.idTipoAtaque;
	}

	public void setIdTipoAtaque(int idTipoAtaque) {
		this.idTipoAtaque = idTipoAtaque;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Tipo> getTipos() {
		return this.tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	public Tipo addTipo(Tipo tipo) {
		getTipos().add(tipo);
		tipo.setTipoAtaque(this);

		return tipo;
	}

	public Tipo removeTipo(Tipo tipo) {
		getTipos().remove(tipo);
		tipo.setTipoAtaque(null);

		return tipo;
	}

}