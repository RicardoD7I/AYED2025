package tp_2.ejercicio_3;

import java.util.ArrayList;

import tp_2.ejercicio_2.BinaryTree;

public class ContadorArbol {

	private BinaryTree<Integer> arbol;

	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public ArrayList<Integer> numerosPares() {
		return numerosParesInOrder(this.arbol);
		// return numerosParesPostOrder(this.arbol);
	}

	private ArrayList<Integer> numerosParesInOrder(BinaryTree<Integer> nodo) {
		ArrayList<Integer> resultado = new ArrayList<Integer>();

		// primero hijo izquierdo
		if (nodo.hasLeftChild()) {
			resultado.addAll(this.numerosParesInOrder(nodo.getLeftChild()));
		}

		// luego proceso la raiz
		if ((nodo.getData() % 2) == 0) {
			resultado.add(nodo.getData());
		}

		// luego hijo derecho
		if (nodo.hasRightChild()) {
			resultado.addAll(this.numerosParesInOrder(nodo.getRightChild()));
		}

		return resultado;

	}

	private ArrayList<Integer> numerosParesPostOrder(BinaryTree<Integer> nodo) {
		ArrayList<Integer> resultado = new ArrayList<Integer>();

		// primero hijo izquierdo
		if (nodo.hasLeftChild()) {
			resultado.addAll(this.numerosParesInOrder(nodo.getLeftChild()));
		}

		// luego hijo derecho
		if (nodo.hasRightChild()) {
			resultado.addAll(this.numerosParesInOrder(nodo.getRightChild()));
		}

		// luego proceso la raiz
		if ((nodo.getData() % 2) == 0) {
			resultado.add(nodo.getData());
		}

		return resultado;

	}

}
