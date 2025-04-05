package tp_1.ejercicio_2;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int numeroN = s.nextInt();
		
		int[] arregloMultiplos = Multiplo.crear(numeroN);
		Multiplo.imprimir(arregloMultiplos);
	}
}
