package tp_2.ejercicio_9;

import tp_2.ejercicio_2.BinaryTree;

public class ParcialArboles {
	public BinaryTree<?> sumAndDif(BinaryTree<Integer> arbol) {
		// si no hay arbol retornar null
		if (arbol == null) return null;

		// en el nodo raiz considerar que el valor del nodo padre es cero
		return sumAndDiffRecursivo(arbol, 0, 0);
	}

	private BinaryTree<Dato> sumAndDiffRecursivo(BinaryTree<Integer> nodo, Integer sumaParcial, Integer valorPadre) {
		BinaryTree<Dato> nuevoNodo = new BinaryTree<Dato>();
		Integer suma = sumaParcial + nodo.getData();
		Integer diferencia = nodo.getData() - valorPadre;
		Dato data = new Dato(suma, diferencia);
		nuevoNodo.setData(data);

		if (nodo.hasLeftChild()) {
			nuevoNodo.addLeftChild(sumAndDiffRecursivo(nodo.getLeftChild(), suma, nodo.getData()));
		}

		if (nodo.hasRightChild()) {
			nuevoNodo.addRightChild(sumAndDiffRecursivo(nodo.getRightChild(), suma, nodo.getData()));
		}

		return nuevoNodo;
	}

}
