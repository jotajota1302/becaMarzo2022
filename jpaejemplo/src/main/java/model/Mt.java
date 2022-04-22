package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mt database table.
 * 
 */
@Entity
@Table(name="mt")
@NamedQuery(name="Mt.findAll", query="SELECT m FROM Mt m")
public class Mt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_aprendizaje", unique=true, nullable=false)
	private int idFormaAprendizaje;

	@Column(nullable=false, length=5)
	private String mt;

	//bi-directional one-to-one association to FormaAprendizaje
	@OneToOne
	@JoinColumn(name="id_forma_aprendizaje", nullable=false, insertable=false, updatable=false)
	private FormaAprendizaje formaAprendizaje;

	public Mt() {
	}

	public int getIdFormaAprendizaje() {
		return this.idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public String getMt() {
		return this.mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public FormaAprendizaje getFormaAprendizaje() {
		return this.formaAprendizaje;
	}

	public void setFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		this.formaAprendizaje = formaAprendizaje;
	}

}