package tp_2.ejercicio_9;

public class Dato {
	
	private Integer suma = null;
	private Integer diferencia = null;
	
	public Dato(Integer suma, Integer diferencia) {
		this.suma = suma;
		this.diferencia = diferencia;
	}
	
	public Integer getSuma() {
		return this.suma;
	}
	
	public Integer getDiferencia() {
		return this.diferencia;
	}
	
	 @Override
	  public String toString() {
	    return "Suma: " + this.suma +", diferencia: " + this.diferencia;
	  } 
}
