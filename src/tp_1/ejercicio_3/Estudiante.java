package tp_1.ejercicio_3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	
	public String tusDatos() {
		String resultado = "";
		resultado = resultado.concat(getNombre()).concat(", ");
		resultado = resultado.concat(getApellido()).concat(", ");
		resultado = resultado.concat(getEmail()).concat(", ");
		resultado = resultado.concat(getDireccion()).concat(", ");

		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
