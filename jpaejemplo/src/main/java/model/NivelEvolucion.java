package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nivel_evolucion database table.
 * 
 */
@Entity
@Table(name="nivel_evolucion")
@NamedQuery(name="NivelEvolucion.findAll", query="SELECT n FROM NivelEvolucion n")
public class NivelEvolucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_evolucion", unique=true, nullable=false)
	private int idFormaEvolucion;

	@Column(nullable=false)
	private int nivel;

	//bi-directional one-to-one association to FormaEvolucion
	@OneToOne
	@JoinColumn(name="id_forma_evolucion", nullable=false, insertable=false, updatable=false)
	private FormaEvolucion formaEvolucion;

	public NivelEvolucion() {
	}

	public int getIdFormaEvolucion() {
		return this.idFormaEvolucion;
	}

	public void setIdFormaEvolucion(int idFormaEvolucion) {
		this.idFormaEvolucion = idFormaEvolucion;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public FormaEvolucion getFormaEvolucion() {
		return this.formaEvolucion;
	}

	public void setFormaEvolucion(FormaEvolucion formaEvolucion) {
		this.formaEvolucion = formaEvolucion;
	}

}