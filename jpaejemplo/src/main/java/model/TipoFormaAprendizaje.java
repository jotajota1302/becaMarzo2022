package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_forma_aprendizaje database table.
 * 
 */
@Entity
@Table(name="tipo_forma_aprendizaje")
@NamedQuery(name="TipoFormaAprendizaje.findAll", query="SELECT t FROM TipoFormaAprendizaje t")
public class TipoFormaAprendizaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo_aprendizaje", unique=true, nullable=false)
	private int idTipoAprendizaje;

	@Column(name="tipo_aprendizaje", nullable=false, length=20)
	private String tipoAprendizaje;

	//bi-directional many-to-one association to FormaAprendizaje
	@OneToMany(mappedBy="tipoFormaAprendizaje")
	private List<FormaAprendizaje> formaAprendizajes;

	public TipoFormaAprendizaje() {
	}

	public int getIdTipoAprendizaje() {
		return this.idTipoAprendizaje;
	}

	public void setIdTipoAprendizaje(int idTipoAprendizaje) {
		this.idTipoAprendizaje = idTipoAprendizaje;
	}

	public String getTipoAprendizaje() {
		return this.tipoAprendizaje;
	}

	public void setTipoAprendizaje(String tipoAprendizaje) {
		this.tipoAprendizaje = tipoAprendizaje;
	}

	public List<FormaAprendizaje> getFormaAprendizajes() {
		return this.formaAprendizajes;
	}

	public void setFormaAprendizajes(List<FormaAprendizaje> formaAprendizajes) {
		this.formaAprendizajes = formaAprendizajes;
	}

	public FormaAprendizaje addFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		getFormaAprendizajes().add(formaAprendizaje);
		formaAprendizaje.setTipoFormaAprendizaje(this);

		return formaAprendizaje;
	}

	public FormaAprendizaje removeFormaAprendizaje(FormaAprendizaje formaAprendizaje) {
		getFormaAprendizajes().remove(formaAprendizaje);
		formaAprendizaje.setTipoFormaAprendizaje(null);

		return formaAprendizaje;
	}

}