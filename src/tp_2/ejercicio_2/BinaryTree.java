package tp_2.ejercicio_2;

import tp_1.ejercicio_8.Queue;

public class BinaryTree<T> {

	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * 
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty() {
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}

	public boolean hasLeftChild() {
		return this.leftChild != null;
	}

	public boolean hasRightChild() {
		return this.rightChild != null;
	}

	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		int totalHojas = 0;
		if (this.isLeaf()) {
			totalHojas = totalHojas + 1;
		} else {
			if (this.hasLeftChild()) {
				totalHojas = totalHojas + this.getLeftChild().contarHojas();
			}
			if (this.hasRightChild()) {
				totalHojas = totalHojas + this.getRightChild().contarHojas();
			}
		}
		return totalHojas;
	}

	public BinaryTree<T> espejo() {
		BinaryTree<T> arbolEspejo = new BinaryTree<T>(this.getData());
		if (this.hasLeftChild()) {
			arbolEspejo.addRightChild(this.getLeftChild().espejo());
		}
		if (this.hasRightChild()) {
			arbolEspejo.addLeftChild(this.getLeftChild().espejo());
		}
		return arbolEspejo;
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m) {
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		int nivel = 0;
		boolean continuarLoop = true;

		cola.enqueue(this);
		cola.enqueue(null); // marca de nivel

		while (!cola.isEmpty() && continuarLoop) {
			// desencolo
			BinaryTree<T> nodo = cola.dequeue();

			// si es null se llego al final de nivel
			if (nodo != null) {
				if (nivel >= n && nivel <= m) {
					System.out.println(nodo.getData());
				} else if (nivel > m) {
					// condicion de corte
					continuarLoop = false;
				} else {
					if (nodo.hasLeftChild()) {
						cola.enqueue(nodo.getLeftChild());
					}
					if (nodo.hasRightChild()) {
						cola.enqueue(nodo.getRightChild());
					}
				}

			} else {
				// cambia de nivel
				nivel++;

				if (!cola.isEmpty()) {
					// marca de nivel para la siguiente linea
					cola.enqueue(null);
				}
				System.out.println("");

			}

		}
	}

}
