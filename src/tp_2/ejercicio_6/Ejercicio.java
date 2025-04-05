package tp_2.ejercicio_6;

import tp_2.ejercicio_2.BinaryTree;
import tp_2.ejercicio_2.PrintArbolBinario;

public class Ejercicio {
	public static void main(String[] args) {
		PrintArbolBinario<Integer> impresora = new PrintArbolBinario<Integer>();


		// arbol
		BinaryTree<Integer> raiz = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_1 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_2 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_3 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_4 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_5 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_6 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_7  = new BinaryTree<Integer>();



		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addRightChild(nodo_3);
		
		nodo_2.addLeftChild(nodo_4);
		nodo_2.addRightChild(nodo_5);
		
		nodo_4.addLeftChild(nodo_6);
		nodo_4.addRightChild(nodo_7);

		// datos
		raiz.setData(1);
		nodo_1.setData(2);
		nodo_2.setData(3);
		nodo_3.setData(4);
		nodo_4.setData(5);
		nodo_5.setData(6);
		nodo_6.setData(7);
		nodo_7.setData(8);
		
		Transformacion transformacion = new Transformacion(raiz);
		BinaryTree<Integer> resultado = transformacion.suma();
		
		impresora.preOrder(resultado);
		
	}
}
