package tp_2.ejercicio_2;

public class Ejercicio {
	public static void main(String[] args) {

		ejercicioA();
		
		ejercicioB();

	}

	public static void ejercicioA() {
		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_6 = new BinaryTree<Integer>();

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addLeftChild(nodo_3);
		nodo_1.addRightChild(nodo_4);
		nodo_2.addLeftChild(nodo_5);
		nodo_2.addRightChild(nodo_6);

		// datos
		raiz.setData(1);
		nodo_1.setData(2);
		nodo_2.setData(3);
		nodo_3.setData(4);
		nodo_4.setData(5);
		nodo_5.setData(6);
		nodo_6.setData(7);

		int cantHojas = raiz.contarHojas();
		System.out.println(cantHojas);
		raiz.entreNiveles(1, 3);
		// PrintArbolBinario.inOrder(raiz);
	}

	public static void ejercicioB() {
		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_6 = new BinaryTree<Integer>();

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addLeftChild(nodo_3);
		nodo_1.addRightChild(nodo_4);
		nodo_2.addLeftChild(nodo_5);
		nodo_2.addRightChild(nodo_6);

		// datos
		raiz.setData(1);
		nodo_1.setData(2);
		nodo_2.setData(3);
		nodo_3.setData(4);
		nodo_4.setData(5);
		nodo_5.setData(6);
	}

}
