package tp_1.ejercicio_5;

public class Resultado {
	private int max;
	private int min;
	private int prom;
	
	public Resultado(int max, int min, int prom) {
		setMax(max);
		setMin(min);
		setProm(prom);
		
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getProm() {
		return prom;
	}
	public void setProm(int prom) {
		this.prom = prom;
	}
	
	
}
