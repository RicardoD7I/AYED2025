package tp_3.ejercicio_5;

import java.util.LinkedList;
import java.util.List;

import tp_3.ejercicio_1.GeneralTree;

public class Ejercicio {

	public static void main(String[] args) {
		GeneralTree<Integer> raiz = getArbolPrueba();
		boolean esAncestro = raiz.esAncestro(5, 12);
		System.out.println(esAncestro);
	}

	private static GeneralTree<Integer> getArbolPrueba() {
		// nodos del arbol
		GeneralTree<Integer> raiz = new GeneralTree<Integer>(1);
		GeneralTree<Integer> nodo_1 = new GeneralTree<Integer>(2);
		GeneralTree<Integer> nodo_2 = new GeneralTree<Integer>(3);
		GeneralTree<Integer> nodo_3 = new GeneralTree<Integer>(4);
		GeneralTree<Integer> nodo_4 = new GeneralTree<Integer>(5);
		GeneralTree<Integer> nodo_5 = new GeneralTree<Integer>(6);
		GeneralTree<Integer> nodo_6 = new GeneralTree<Integer>(7);
		GeneralTree<Integer> nodo_7 = new GeneralTree<Integer>(8);
		GeneralTree<Integer> nodo_8 = new GeneralTree<Integer>(9);
		GeneralTree<Integer> nodo_9 = new GeneralTree<Integer>(10);
		GeneralTree<Integer> nodo_10 = new GeneralTree<Integer>(11);
		GeneralTree<Integer> nodo_11 = new GeneralTree<Integer>(12);

		// hijos de cada nodo
		List<GeneralTree<Integer>> hijos_raiz = new LinkedList<GeneralTree<Integer>>();
		List<GeneralTree<Integer>> hijos_nodo_1 = new LinkedList<GeneralTree<Integer>>();
		List<GeneralTree<Integer>> hijos_nodo_2 = new LinkedList<GeneralTree<Integer>>();
		List<GeneralTree<Integer>> hijos_nodo_3 = new LinkedList<GeneralTree<Integer>>();
		List<GeneralTree<Integer>> hijos_nodo_4 = new LinkedList<GeneralTree<Integer>>();

		// aristas
		hijos_raiz.add(nodo_1);
		hijos_raiz.add(nodo_2);
		hijos_raiz.add(nodo_3);
		hijos_raiz.add(nodo_4);

		hijos_nodo_1.add(nodo_5);
		hijos_nodo_1.add(nodo_6);
		hijos_nodo_1.add(nodo_7);

		hijos_nodo_2.add(nodo_8);

		hijos_nodo_3.add(nodo_9);

		hijos_nodo_4.add(nodo_10);
		hijos_nodo_4.add(nodo_11);

		// asignar hijos
		raiz.setChildren(hijos_raiz);
		nodo_1.setChildren(hijos_nodo_1);
		nodo_2.setChildren(hijos_nodo_2);
		nodo_3.setChildren(hijos_nodo_3);
		nodo_4.setChildren(hijos_nodo_4);

		return raiz;
	}

}
