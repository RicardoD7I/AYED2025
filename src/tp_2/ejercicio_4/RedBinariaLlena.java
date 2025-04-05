package tp_2.ejercicio_4;

import tp_2.ejercicio_2.BinaryTree;

public class RedBinariaLlena {
	BinaryTree<Integer> arbol;

	public RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public int retardoReenvio() {
		return retardoReenvioRecursivo(this.arbol);

	}

	private int retardoReenvioRecursivo(BinaryTree<Integer> arbol) {
		int maximoIzquierdo = arbol.getData();
		int maximoDerecho = arbol.getData();

		if (arbol.hasLeftChild()) {
			maximoIzquierdo += retardoReenvioRecursivo(arbol.getLeftChild());
		}

		if (arbol.hasRightChild()) {
			maximoDerecho += retardoReenvioRecursivo(arbol.getRightChild());
		}

		return Math.max(maximoIzquierdo, maximoDerecho);
	}
}
