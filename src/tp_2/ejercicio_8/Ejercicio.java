package tp_2.ejercicio_8;

import tp_2.ejercicio_2.BinaryTree;

public class Ejercicio {

	public static void main(String[] args) {
		BinaryTree<Integer> arbol1 = getArbol1();
		BinaryTree<Integer> arbol2 = getArbol2();

		ParcialArboles parcial = new ParcialArboles();
		boolean result = parcial.esPrefijo(arbol1, arbol2);
		System.out.println(result);
	}

	private static BinaryTree<Integer> getArbol1() {
		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addRightChild(nodo_3);
		nodo_2.addRightChild(nodo_4);

		// datos
		raiz.setData(65);
		nodo_1.setData(37);
		nodo_2.setData(81);
		nodo_3.setData(47);
		nodo_4.setData(93);

		return raiz;
	}

	// cambiar este:

	private static BinaryTree<Integer> getArbol2() {
		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_6 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_7 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_8 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_9 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_10 = new BinaryTree<Integer>();

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addRightChild(nodo_3);
		nodo_1.addLeftChild(nodo_5);
		nodo_2.addRightChild(nodo_4);
		nodo_2.addLeftChild(nodo_8);
		nodo_5.addRightChild(nodo_7);
		nodo_5.addLeftChild(nodo_6);
		nodo_4.addLeftChild(nodo_9);
		nodo_4.addRightChild(nodo_10);

		// datos
		raiz.setData(65);
		nodo_1.setData(37);
		nodo_2.setData(81);
		nodo_3.setData(47);
		nodo_4.setData(93);
		nodo_5.setData(22);
		nodo_8.setData(76);
		nodo_6.setData(11);
		nodo_7.setData(29);
		nodo_9.setData(85);
		nodo_10.setData(94);
		return raiz;
	}

}
