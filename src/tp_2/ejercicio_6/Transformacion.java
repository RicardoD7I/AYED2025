package tp_2.ejercicio_6;

import tp_2.ejercicio_2.BinaryTree;

public class Transformacion {
	
	BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma(){
		 sumaRecursiva(this.arbol);
		 return this.arbol;
	}

	private int sumaRecursiva(BinaryTree<Integer> nodo) {
		Integer sumaTotal = 0;
		Integer aux = nodo.getData();
		
		if (nodo.isLeaf()) {
			sumaTotal = nodo.getData();
			nodo.setData(0);
		} else {
			if (nodo.hasLeftChild()) {
				sumaTotal +=sumaRecursiva(nodo.getLeftChild());
			}
			
			if (nodo.hasRightChild()) {
				sumaTotal +=  sumaRecursiva(nodo.getRightChild());
			}
			nodo.setData(sumaTotal);
			sumaTotal += aux;
		}
		
		return sumaTotal;
	}

}
