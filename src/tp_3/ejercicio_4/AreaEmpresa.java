package tp_3.ejercicio_4;

public class AreaEmpresa {
	
	private String identificacion;
	private int tardanza;
	
	public AreaEmpresa(String nombre, int tardanza) {
		this.identificacion = nombre;
		this.tardanza = tardanza;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String nombre) {
		this.identificacion = nombre;
	}

	public int getTardanza() {
		return tardanza;
	}

	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}

}
