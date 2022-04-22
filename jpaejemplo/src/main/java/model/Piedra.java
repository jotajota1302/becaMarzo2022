package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the piedra database table.
 * 
 */
@Entity
@Table(name="piedra")
@NamedQuery(name="Piedra.findAll", query="SELECT p FROM Piedra p")
public class Piedra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_evolucion", unique=true, nullable=false)
	private int idFormaEvolucion;

	//bi-directional many-to-one association to TipoPiedra
	@ManyToOne
	@JoinColumn(name="id_tipo_piedra")
	private TipoPiedra tipoPiedra;

	//bi-directional one-to-one association to FormaEvolucion
	@OneToOne
	@JoinColumn(name="id_forma_evolucion", nullable=false, insertable=false, updatable=false)
	private FormaEvolucion formaEvolucion;

	public Piedra() {
	}

	public int getIdFormaEvolucion() {
		return this.idFormaEvolucion;
	}

	public void setIdFormaEvolucion(int idFormaEvolucion) {
		this.idFormaEvolucion = idFormaEvolucion;
	}

	public TipoPiedra getTipoPiedra() {
		return this.tipoPiedra;
	}

	public void setTipoPiedra(TipoPiedra tipoPiedra) {
		this.tipoPiedra = tipoPiedra;
	}

	public FormaEvolucion getFormaEvolucion() {
		return this.formaEvolucion;
	}

	public void setFormaEvolucion(FormaEvolucion formaEvolucion) {
		this.formaEvolucion = formaEvolucion;
	}

}