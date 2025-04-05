package tp_2.ejercicio_4;

import java.util.List;

import tp_2.ejercicio_2.BinaryTree;
import tp_2.ejercicio_3.ContadorArbol;

public class Ejercicio {

	public static void main(String[] args) {
		ejercicio();
	}

	public static void ejercicio() {

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
		BinaryTree<Integer> nodo_11 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_12 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_13 = new BinaryTree<Integer>();
		BinaryTree<Integer> nodo_14 = new BinaryTree<Integer>();

		RedBinariaLlena redBinaria = new RedBinariaLlena(raiz);

		// aristas
		raiz.addLeftChild(nodo_1);
		raiz.addRightChild(nodo_2);
		nodo_1.addLeftChild(nodo_3);
		nodo_1.addRightChild(nodo_4);
		nodo_2.addLeftChild(nodo_5);
		nodo_2.addRightChild(nodo_6);
		
		nodo_3.addLeftChild(nodo_7);
		nodo_3.addRightChild(nodo_8);

		nodo_4.addLeftChild(nodo_9);
		nodo_4.addRightChild(nodo_10);
		
		nodo_5.addLeftChild(nodo_11);
		nodo_5.addRightChild(nodo_12);
		
		nodo_6.addLeftChild(nodo_13);
		nodo_6.addRightChild(nodo_14);
		
		
		// datos
		raiz.setData(10);
		nodo_1.setData(2);
		nodo_2.setData(3);
		nodo_3.setData(5);
		nodo_4.setData(4);
		nodo_5.setData(9);
		nodo_6.setData(8);
		nodo_7.setData(7);
		nodo_8.setData(8);
		nodo_9.setData(5);
		nodo_10.setData(6);
		nodo_11.setData(12);
		nodo_12.setData(8);
		nodo_13.setData(2);
		nodo_14.setData(1);

		int retardoMaximo = redBinaria.retardoReenvio();
		System.out.println(retardoMaximo);
	}

}
