package tp_1.ejercicio_5;

public class DevolverPorParametro {

	public static void maxMinAvg(int[] arreglo, Resultado resultado) {
		
		// asumo maximo, minimo y promedio de posicion inicial
		int min = arreglo[0]; 
		int max = arreglo[0];
		int prom = arreglo[0];

        // realizar el calculo
        for (int i = 1; i < arreglo.length; i++) {
        	// si el actual es mayor al nuevo
            if (min > arreglo[i]) {
                min = arreglo[i];
            }
            // si el valor actual es menor al nuevo, actualizo
            else if (max < arreglo[i]) {
               max = arreglo[i];
            }

            // acumulo suma del promedio
            prom = prom + arreglo[i];
        }
        // calculo promedio
        prom = prom / arreglo.length;
        
        // interactuar con un parametro y devolver el resultado
        resultado.setMax(max);
        resultado.setMin(min);
        resultado.setProm(prom);

	}
}
