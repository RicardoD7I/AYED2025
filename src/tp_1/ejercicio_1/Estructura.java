package tp_1.ejercicio_1;

public class Estructura {
	
	// asume que a es menor que b

	public static void iteraConFor(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	public static void iteraConWhile(int a, int b) {

		int i = a;
		while (b >= i) {
			System.out.println(i);
			i++;
		}
	}

	public static void iteraSinEstructuras(int a, int b) {
		// sin for, while, do while
		if (a <= b) {
			System.out.println(a);
			iteraSinEstructuras(a+1, b);
		}
	}

}
