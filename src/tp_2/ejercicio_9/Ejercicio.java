package tp_2.ejercicio_9;

import tp_2.ejercicio_2.BinaryTree;
import tp_2.ejercicio_2.PrintArbolBinario;

public class Ejercicio {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		BinaryTree<Integer> arbol = getEjemplo();
		PrintArbolBinario<Dato> impresora = new PrintArbolBinario<Dato>();
		BinaryTree<Dato> resultado = null;
		ParcialArboles parcial = new ParcialArboles();
		resultado = (BinaryTree<Dato>) parcial.sumAndDif(arbol);
		impresora.inOrder(resultado);
	}

	private static BinaryTree<Integer> getEjemplo() {

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

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);

		nodo_1.addLeftChild(nodo_3);
		nodo_1.addRightChild(nodo_4);

		nodo_2.addLeftChild(nodo_5);
		nodo_2.addRightChild(nodo_6);

		nodo_4.addLeftChild(nodo_7);
		nodo_5.addRightChild(nodo_8);
		nodo_5.addRightChild(nodo_9);

		// datos
		raiz.setData(20);
		nodo_1.setData(5);
		nodo_2.setData(30);
		nodo_3.setData(-5);
		nodo_4.setData(10);
		nodo_5.setData(50);
		nodo_6.setData(-9);
		nodo_7.setData(1);
		nodo_8.setData(4);
		nodo_9.setData(6);

		return raiz;
	}
}
