package tp_2.ejercicio_7;

import tp_2.ejercicio_2.BinaryTree;

public class ParcialArboles {

	BinaryTree<Integer> arbol;

	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public boolean isLeftTree(int num) {
		boolean result = false;
		BinaryTree<Integer> nodoEncontrado = buscarNodo(this.arbol, num);
		if (nodoEncontrado != null) {
			result = isLeftTree(nodoEncontrado);
		} else {
			result = false;
		}
		return result;
	}

	private BinaryTree<Integer> buscarNodo(BinaryTree<Integer> nodo, int num) {
		BinaryTree<Integer> result = null;
		Integer numero = nodo.getData();
		if (numero == num) {
			result = nodo;
		} else {
			if (nodo.hasLeftChild()) {
				BinaryTree<Integer> busquedaIzq = buscarNodo(nodo.getLeftChild(), num);
				if (busquedaIzq != null) {
					Integer numeroIzq = busquedaIzq.getData();
					if (numeroIzq == num) {
						result = busquedaIzq;
					} else {
						if (nodo.hasRightChild()) {
							BinaryTree<Integer> busquedaDer = buscarNodo(nodo.getRightChild(), num);
							Integer numeroDer = busquedaDer.getData();
							if (numeroDer == num) {
								result = busquedaDer;
							}
						}
					}

				}
			}
		}

		return result;
	}

	private boolean isLeftTree(BinaryTree<Integer> nodo) {
		int cantNodosIzqConUnSoloHijo = -1;
		int cantNodosDerConUnSoloHijo = -1;

		if (nodo.hasLeftChild()) {
			cantNodosIzqConUnSoloHijo = contarNodos(nodo.getLeftChild());
		}

		if (nodo.hasRightChild()) {
			cantNodosDerConUnSoloHijo = contarNodos(nodo.getRightChild());
		}

		return cantNodosIzqConUnSoloHijo > cantNodosDerConUnSoloHijo;

	}

	private int contarNodos(BinaryTree<Integer> nodo) {
		int cantidadHijos = 0;
		int cantidadArbolesConUnicoHijo = 0;
		if (nodo.hasLeftChild()) {
			cantidadHijos++;
		}
		if (nodo.hasRightChild()) {
			cantidadHijos++;
		}

		if (cantidadHijos == 1) {
			cantidadArbolesConUnicoHijo++;
		}

		if (nodo.hasLeftChild()) {
			cantidadArbolesConUnicoHijo = cantidadArbolesConUnicoHijo + contarNodos(nodo.getLeftChild());
		}

		if (nodo.hasRightChild()) {
			cantidadArbolesConUnicoHijo = cantidadArbolesConUnicoHijo + contarNodos(nodo.getRightChild());
		}
		return cantidadArbolesConUnicoHijo;
	}

}
