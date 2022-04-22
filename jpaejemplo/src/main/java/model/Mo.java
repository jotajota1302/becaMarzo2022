package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mo database table.
 * 
 */
@Entity
@Table(name="mo")
@NamedQuery(name="Mo.findAll", query="SELECT m FROM Mo m")
public class Mo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_aprendizaje", unique=true, nullable=false)
	private int idFormaAprendizaje;

	@Column(nullable=false, length=5)
	private String mo;

	//bi-directional one-to-one association to FormaAprendizaje
	@OneToOne
	@JoinColumn(name="id_forma_aprendizaje", nullable=false, insertable=false, updatable=false)
	private FormaAprendizaje formaAprendizaje;

	public Mo() {
	}

	public int getIdFormaAprendizaje() {
		return this.idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public String getMo() {
		return this.mo;
	}

	public void setMo(String mo) {
		this.mo = mo;
	}

	public FormaAprendizaje getFormaAprendizaje() {
		return this.formaAprendizaje;
	}

	public void setFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		this.formaAprendizaje = formaAprendizaje;
	}

}