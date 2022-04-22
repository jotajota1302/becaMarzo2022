package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the cantidad_tipo_pokemon database table.
 * 
 */
@Entity
@Table(name="cantidad_tipo_pokemon")
@NamedQuery(name="CantidadTipoPokemon.findAll", query="SELECT c FROM CantidadTipoPokemon c")
public class CantidadTipoPokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private BigInteger cantidad;

	@Column(nullable=false, length=10)
	private String tipo;

	public CantidadTipoPokemon() {
	}

	public BigInteger getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigInteger cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}