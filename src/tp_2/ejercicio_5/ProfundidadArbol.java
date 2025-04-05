package tp_2.ejercicio_5;

import tp_1.ejercicio_8.Queue;
import tp_2.ejercicio_2.BinaryTree;

public class ProfundidadArbol {

	BinaryTree<Integer> arbol;

	public ProfundidadArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public int sumaElementosProfundidad(int p) {
		int resultado = 0;
		int nivel = 0;
	
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		
		cola.enqueue(this.arbol); 
		cola.enqueue(null); // marca de nivel
		
		while (!cola.isEmpty()) {
			BinaryTree<Integer> ab = cola.dequeue();
			// si no se llego al fin del nivel
			if(ab!= null) {
				if (nivel == p) {
					resultado += ab.getData();
				}
				
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			} else {
				if (!cola.isEmpty()) {
					// marca de nivel para la siguiente linea
					cola.enqueue(null);
					nivel ++;
				}
			}
		}
		return resultado;
	}
}
