package tp_1.ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {
	public static List<Integer> calcularSucesion(int n) {
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(n);
		resultado.addAll(calcularSucesionRecursivo(n));
		return resultado;

	}

	private static List<Integer> calcularSucesionRecursivo(Integer n) {
		List<Integer> resultado = new ArrayList<Integer>();
		Integer calculo = null;

		if (n != 1) {
			if (n % 2 == 0) {
				calculo = n / 2;
			} else {
				calculo = (3 * n) + 1;
			}
			resultado.add(calculo);
			resultado.addAll(calcularSucesionRecursivo(calculo));
		}

		return resultado;

	}

	public static void main(String[] args) {
		List<Integer> sucesion = new ArrayList<Integer>();
		sucesion = calcularSucesion(6);
		System.out.println(sucesion.toString());
	}
}
