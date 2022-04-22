package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the movimiento_efecto_secundario database table.
 * 
 */
@Entity
@Table(name="movimiento_efecto_secundario")
@NamedQuery(name="MovimientoEfectoSecundario.findAll", query="SELECT m FROM MovimientoEfectoSecundario m")
public class MovimientoEfectoSecundario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MovimientoEfectoSecundarioPK id;

	@Column(nullable=false)
	private double probabilidad;

	//bi-directional many-to-one association to Movimiento
	@ManyToOne
	@JoinColumn(name="id_movimiento", nullable=false, insertable=false, updatable=false)
	private Movimiento movimiento;

	//bi-directional many-to-one association to EfectoSecundario
	@ManyToOne
	@JoinColumn(name="id_efecto_secundario", nullable=false, insertable=false, updatable=false)
	private EfectoSecundario efectoSecundario;

	public MovimientoEfectoSecundario() {
	}

	public MovimientoEfectoSecundarioPK getId() {
		return this.id;
	}

	public void setId(MovimientoEfectoSecundarioPK id) {
		this.id = id;
	}

	public double getProbabilidad() {
		return this.probabilidad;
	}

	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}

	public Movimiento getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public EfectoSecundario getEfectoSecundario() {
		return this.efectoSecundario;
	}

	public void setEfectoSecundario(EfectoSecundario efectoSecundario) {
		this.efectoSecundario = efectoSecundario;
	}

}