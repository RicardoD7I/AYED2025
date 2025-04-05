package tp_1.ejercicio_5;

public class Ejercicio {

	public static void main(String args[]) {
		// arreglo de prueba
		int [] arreglo = {1,2,3,4,5};
		
		// por return
		Resultado resultadoPorReturn = DevolverReturn.maxMinAvg(arreglo);
		imprimir(resultadoPorReturn);
		
		// interactuando con un parametro
		Resultado resultadoInteractuandoParametro = new Resultado(0,0,0);
		DevolverPorParametro.maxMinAvg(arreglo, resultadoInteractuandoParametro);
		imprimir(resultadoInteractuandoParametro);
		
		
		// sin usar return, ni interactuar con un parametro
		DevolverSinParametroSinReturn.maxMinAvg(arreglo);
		imprimir(DevolverSinParametroSinReturn.getResultado());
	}
	
	public static void imprimir(Resultado res) {
		System.out.println("Maximo: " + res.getMax());
		System.out.println("Minimo: " + res.getMin());
		System.out.println("Promedio: " + res.getProm());
	}
}
