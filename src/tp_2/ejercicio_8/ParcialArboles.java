package tp_2.ejercicio_8;

import tp_2.ejercicio_2.BinaryTree;

public class ParcialArboles {

	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		boolean result = false;
		Integer dato_1 = (arbol1 != null) ? arbol1.getData() : null;
		Integer dato_2 = (arbol2 != null) ? arbol2.getData() : null;
		

		// compruebo que el dato sea igual
		result = dato_1 == dato_2;

		// compruebo estructura y datos de hijos
		if (result) {
			// verifico arbol izquierdo
			BinaryTree<Integer> arbol1Izq = (arbol1 != null && arbol1.hasLeftChild()) ? arbol1.getLeftChild() : null;
			BinaryTree<Integer> arbol2Izq = (arbol2 != null && arbol2.hasLeftChild()) ? arbol2.getLeftChild() : null;

			result = ((arbol1Izq != null) || (arbol1Izq  != null)) ? esPrefijo(arbol1Izq, arbol2Izq) : result;
			if (result) {
				// en caso de que arbol izquierdo sea correcto
				// verifico arbol derecho
				BinaryTree<Integer> arbol1Der = (arbol1 != null && arbol1.hasRightChild()) ? arbol1.getRightChild()
						: null;
				BinaryTree<Integer> arbol2Der = (arbol2 != null && arbol2.hasRightChild()) ? arbol2.getRightChild()
						: null;

				result = ((arbol1Der != null) || (arbol2Der  != null)) ? esPrefijo(arbol1Der, arbol2Der) : result;

			}
		}

		return result;

	}
}
