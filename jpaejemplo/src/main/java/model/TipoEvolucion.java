package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_evolucion database table.
 * 
 */
@Entity
@Table(name="tipo_evolucion")
@NamedQuery(name="TipoEvolucion.findAll", query="SELECT t FROM TipoEvolucion t")
public class TipoEvolucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_evolucion", unique=true, nullable=false)
	private int idTipoEvolucion;

	@Column(name="tipo_evolucion", nullable=false, length=15)
	private String tipoEvolucion;

	//bi-directional many-to-one association to FormaEvolucion
	@OneToMany(mappedBy="tipoEvolucionBean")
	private List<FormaEvolucion> formaEvolucions;

	public TipoEvolucion() {
	}

	public int getIdTipoEvolucion() {
		return this.idTipoEvolucion;
	}

	public void setIdTipoEvolucion(int idTipoEvolucion) {
		this.idTipoEvolucion = idTipoEvolucion;
	}

	public String getTipoEvolucion() {
		return this.tipoEvolucion;
	}

	public void setTipoEvolucion(String tipoEvolucion) {
		this.tipoEvolucion = tipoEvolucion;
	}

	public List<FormaEvolucion> getFormaEvolucions() {
		return this.formaEvolucions;
	}

	public void setFormaEvolucions(List<FormaEvolucion> formaEvolucions) {
		this.formaEvolucions = formaEvolucions;
	}

	public FormaEvolucion addFormaEvolucion(FormaEvolucion formaEvolucion) {
		getFormaEvolucions().add(formaEvolucion);
		formaEvolucion.setTipoEvolucionBean(this);

		return formaEvolucion;
	}

	public FormaEvolucion removeFormaEvolucion(FormaEvolucion formaEvolucion) {
		getFormaEvolucions().remove(formaEvolucion);
		formaEvolucion.setTipoEvolucionBean(null);

		return formaEvolucion;
	}

}