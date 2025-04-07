package tp_2.ejercicio_7;

import tp_2.ejercicio_2.BinaryTree;

public class Ejercicio {
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = getArbolPrueba();
		ParcialArboles ejemplo = new ParcialArboles(arbol);
		int num = -3;
		
		boolean result = ejemplo.isLeftTree(num);
		System.out.println(result);
	}

	public static BinaryTree<Integer> getArbolPrueba() {

		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_6 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_7  = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_8  = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_9  = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_10  = new BinaryTree<Integer>();



		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		
		nodo_1.addLeftChild(nodo_3);
		nodo_1.addRightChild(nodo_4);

		nodo_2.addLeftChild(nodo_5);
		
		nodo_3.addLeftChild(nodo_6);
		
		nodo_4.addLeftChild(nodo_7);
		nodo_4.addRightChild(nodo_8);
		
		nodo_5.addRightChild(nodo_9);
		
		nodo_9.addLeftChild(nodo_10);

		// datos
		raiz.setData(2);
		nodo_1.setData(7);
		nodo_2.setData(-5);
		nodo_3.setData(23);
		nodo_4.setData(6);
		nodo_5.setData(19);
		nodo_6.setData(-3);
		nodo_7.setData(55);
		nodo_8.setData(11);
		nodo_9.setData(4);
		nodo_10.setData(18);
	
		return raiz;
	}
}
