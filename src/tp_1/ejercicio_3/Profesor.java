package tp_1.ejercicio_3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String catedra;
	private String facultad;
	
	public String tusDatos() {
		String resultado = "";
		resultado = resultado.concat(getNombre()).concat(", ");
		resultado = resultado.concat(getApellido()).concat(", ");
		resultado = resultado.concat(getEmail()).concat(", ");
		resultado = resultado.concat(getCatedra()).concat(", ");
		resultado = resultado.concat(getFacultad());

		return resultado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
