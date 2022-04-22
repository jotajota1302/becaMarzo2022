package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the efecto_secundario database table.
 * 
 */
@Entity
@Table(name="efecto_secundario")
@NamedQuery(name="EfectoSecundario.findAll", query="SELECT e FROM EfectoSecundario e")
public class EfectoSecundario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_efecto_secundario", unique=true, nullable=false)
	private int idEfectoSecundario;

	@Column(name="efecto_secundario", nullable=false, length=30)
	private String efectoSecundario;

	//bi-directional many-to-one association to MovimientoEfectoSecundario
	@OneToMany(mappedBy="efectoSecundario")
	private List<MovimientoEfectoSecundario> movimientoEfectoSecundarios;

	public EfectoSecundario() {
	}

	public int getIdEfectoSecundario() {
		return this.idEfectoSecundario;
	}

	public void setIdEfectoSecundario(int idEfectoSecundario) {
		this.idEfectoSecundario = idEfectoSecundario;
	}

	public String getEfectoSecundario() {
		return this.efectoSecundario;
	}

	public void setEfectoSecundario(String efectoSecundario) {
		this.efectoSecundario = efectoSecundario;
	}

	public List<MovimientoEfectoSecundario> getMovimientoEfectoSecundarios() {
		return this.movimientoEfectoSecundarios;
	}

	public void setMovimientoEfectoSecundarios(List<MovimientoEfectoSecundario> movimientoEfectoSecundarios) {
		this.movimientoEfectoSecundarios = movimientoEfectoSecundarios;
	}

	public MovimientoEfectoSecundario addMovimientoEfectoSecundario(MovimientoEfectoSecundario movimientoEfectoSecundario) {
		getMovimientoEfectoSecundarios().add(movimientoEfectoSecundario);
		movimientoEfectoSecundario.setEfectoSecundario(this);

		return movimientoEfectoSecundario;
	}

	public MovimientoEfectoSecundario removeMovimientoEfectoSecundario(MovimientoEfectoSecundario movimientoEfectoSecundario) {
		getMovimientoEfectoSecundarios().remove(movimientoEfectoSecundario);
		movimientoEfectoSecundario.setEfectoSecundario(null);

		return movimientoEfectoSecundario;
	}

}