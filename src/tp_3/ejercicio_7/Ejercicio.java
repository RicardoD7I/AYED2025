package tp_3.ejercicio_7;

import java.util.ArrayList;
import java.util.List;

import tp_3.ejercicio_1.GeneralTree;

public class Ejercicio {

	public static void main(String[] args) {
		GeneralTree<Integer> arbol = getArbolPrueba();
		List<Integer> caminoAHojaMasLejana = new ArrayList<Integer>();
		Caminos camino = new Caminos(arbol);
		caminoAHojaMasLejana = camino.caminoAHojaMasLejana();
		System.out.println(caminoAHojaMasLejana);
	}

	private static GeneralTree<Integer> getArbolPrueba() {
		// arbol
		GeneralTree<Integer> raiz = new GeneralTree<Integer>(12);
		GeneralTree<Integer> nodo_1 = new GeneralTree<Integer>(17);
		GeneralTree<Integer> nodo_2 = new GeneralTree<Integer>(9);
		GeneralTree<Integer> nodo_3 = new GeneralTree<Integer>(15);

		GeneralTree<Integer> nodo_1_1 = new GeneralTree<Integer>(10);
		GeneralTree<Integer> nodo_1_2 = new GeneralTree<Integer>(6);

		GeneralTree<Integer> nodo_2_1 = new GeneralTree<Integer>(8);

		GeneralTree<Integer> nodo_3_1 = new GeneralTree<Integer>(14);
		GeneralTree<Integer> nodo_3_2 = new GeneralTree<Integer>(18);

		GeneralTree<Integer> nodo_1_2_1 = new GeneralTree<Integer>(1);

		GeneralTree<Integer> nodo_3_1_1 = new GeneralTree<Integer>(16);
		GeneralTree<Integer> nodo_3_1_2 = new GeneralTree<Integer>(7);

		// aristas
		raiz.addChild(nodo_1);
		raiz.addChild(nodo_2);
		raiz.addChild(nodo_3);

		nodo_1.addChild(nodo_1_1);
		nodo_1.addChild(nodo_1_2);

		nodo_2.addChild(nodo_2_1);

		nodo_3.addChild(nodo_3_1);
		nodo_3.addChild(nodo_3_2);

		nodo_1_2.addChild(nodo_1_2_1);

		nodo_3_1.addChild(nodo_3_1_1);
		nodo_3_1.addChild(nodo_3_1_2);

		return raiz;
	}

}
