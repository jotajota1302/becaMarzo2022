package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_piedra database table.
 * 
 */
@Entity
@Table(name="tipo_piedra")
@NamedQuery(name="TipoPiedra.findAll", query="SELECT t FROM TipoPiedra t")
public class TipoPiedra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_piedra", unique=true, nullable=false)
	private int idTipoPiedra;

	@Column(name="nombre_piedra", nullable=false, length=20)
	private String nombrePiedra;

	//bi-directional many-to-one association to Piedra
	@OneToMany(mappedBy="tipoPiedra")
	private List<Piedra> piedras;

	public TipoPiedra() {
	}

	public int getIdTipoPiedra() {
		return this.idTipoPiedra;
	}

	public void setIdTipoPiedra(int idTipoPiedra) {
		this.idTipoPiedra = idTipoPiedra;
	}

	public String getNombrePiedra() {
		return this.nombrePiedra;
	}

	public void setNombrePiedra(String nombrePiedra) {
		this.nombrePiedra = nombrePiedra;
	}

	public List<Piedra> getPiedras() {
		return this.piedras;
	}

	public void setPiedras(List<Piedra> piedras) {
		this.piedras = piedras;
	}

	public Piedra addPiedra(Piedra piedra) {
		getPiedras().add(piedra);
		piedra.setTipoPiedra(this);

		return piedra;
	}

	public Piedra removePiedra(Piedra piedra) {
		getPiedras().remove(piedra);
		piedra.setTipoPiedra(null);

		return piedra;
	}

}