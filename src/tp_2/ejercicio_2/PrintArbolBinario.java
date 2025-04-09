package tp_2.ejercicio_2;

public class PrintArbolBinario<T> {


	public void inOrder(BinaryTree<T> nodo) {

	}

	public void preOrder(BinaryTree<?> nodo) {
		System.out.println(nodo.getData());

		if (nodo.hasLeftChild()) {
			preOrder(nodo.getLeftChild());
		}

		if (nodo.hasRightChild()) {
			preOrder(nodo.getRightChild());
		}
	}
	

	public void postOrder() {

	}

}
