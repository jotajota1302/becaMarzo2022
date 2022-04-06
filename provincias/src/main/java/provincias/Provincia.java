package provincias;

public class Provincia {

	private int id;
	
	private ComunidadAutonoma comunidad;
	
	private String nombre;

	public ComunidadAutonoma getComunidad() {
		return comunidad;
	}

	public void setComunidad(ComunidadAutonoma comunidad) {
		this.comunidad = comunidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
}
