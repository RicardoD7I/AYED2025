package tp_1.ejercicio_2;

public class Multiplo {
	public static int[] crear(int n) {
		int[] resultado = new int[n];
		for (int i = 0; i < n; i++) {
			resultado[i] = n * (i + 1);
		}
		return resultado;

	}

	public static void imprimir(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
