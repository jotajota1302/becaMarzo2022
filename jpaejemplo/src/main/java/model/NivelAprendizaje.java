package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nivel_aprendizaje database table.
 * 
 */
@Entity
@Table(name="nivel_aprendizaje")
@NamedQuery(name="NivelAprendizaje.findAll", query="SELECT n FROM NivelAprendizaje n")
public class NivelAprendizaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_forma_aprendizaje", unique=true, nullable=false)
	private int idFormaAprendizaje;

	@Column(nullable=false)
	private int nivel;

	//bi-directional one-to-one association to FormaAprendizaje
	@OneToOne
	@JoinColumn(name="id_forma_aprendizaje", nullable=false, insertable=false, updatable=false)
	private FormaAprendizaje formaAprendizaje;

	public NivelAprendizaje() {
	}

	public int getIdFormaAprendizaje() {
		return this.idFormaAprendizaje;
	}

	public void setIdFormaAprendizaje(int idFormaAprendizaje) {
		this.idFormaAprendizaje = idFormaAprendizaje;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public FormaAprendizaje getFormaAprendizaje() {
		return this.formaAprendizaje;
	}

	public void setFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		this.formaAprendizaje = formaAprendizaje;
	}

}