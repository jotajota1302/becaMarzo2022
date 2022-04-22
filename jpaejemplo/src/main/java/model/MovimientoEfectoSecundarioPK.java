package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the movimiento_efecto_secundario database table.
 * 
 */
@Embeddable
public class MovimientoEfectoSecundarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_movimiento", insertable=false, updatable=false, unique=true, nullable=false)
	private int idMovimiento;

	@Column(name="id_efecto_secundario", insertable=false, updatable=false, unique=true, nullable=false)
	private int idEfectoSecundario;

	public MovimientoEfectoSecundarioPK() {
	}
	public int getIdMovimiento() {
		return this.idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public int getIdEfectoSecundario() {
		return this.idEfectoSecundario;
	}
	public void setIdEfectoSecundario(int idEfectoSecundario) {
		this.idEfectoSecundario = idEfectoSecundario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MovimientoEfectoSecundarioPK)) {
			return false;
		}
		MovimientoEfectoSecundarioPK castOther = (MovimientoEfectoSecundarioPK)other;
		return 
			(this.idMovimiento == castOther.idMovimiento)
			&& (this.idEfectoSecundario == castOther.idEfectoSecundario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMovimiento;
		hash = hash * prime + this.idEfectoSecundario;
		
		return hash;
	}
}