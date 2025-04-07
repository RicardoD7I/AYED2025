package tp_2.ejercicio_8;

import tp_2.ejercicio_2.BinaryTree;

public class ParcialArboles {

	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		if (arbol1 == null) {
			return true;
		} else if (arbol2 == null) {
			return false;
		} else {
			return (arbol1.getData() == arbol2.getData()) 
					&& esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild())
					&& esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
		}
	}

}
