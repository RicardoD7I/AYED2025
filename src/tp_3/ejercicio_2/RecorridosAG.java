package tp_3.ejercicio_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp_1.ejercicio_8.Queue;
import tp_3.ejercicio_1.GeneralTree;

public class RecorridosAG {
	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> lista = new LinkedList<Integer>();
		this.numerosImparesMayoresQuePreOrden(lista, a, n);
		return lista;
	}

	private void numerosImparesMayoresQuePreOrden(List<Integer> l, GeneralTree<Integer> a, Integer n) {
		// primero la raiz
		if (esImparMayorQue(a.getData(), n)) {
			l.add(a.getData());
		}
		// luego los hijos
		List<GeneralTree<Integer>> children = a.getChildren();
		for (GeneralTree<Integer> child : children) {
			numerosImparesMayoresQuePreOrden(l, child, n);
		}
	}

	public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> lista = new LinkedList<Integer>();
		this.numerosImparesMayoresQueInOrden(lista, a, n);
		return lista;
	}

	
	private void numerosImparesMayoresQueInOrden(List<Integer> l, GeneralTree<Integer> a, Integer n) {
        List<GeneralTree<Integer>> children = a.getChildren();
        if(a.hasChildren()) {
        	numerosImparesMayoresQueInOrden(l, children.get(0), n);
        }
    
        if(esImparMayorQue(a.getData(), n)) {
        	l.add(a.getData());
        }
        for(int i=1; i < children.size(); i++) {
            numerosImparesMayoresQueInOrden(l, children.get(i), n);
        }
	}

	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n) {
		List<Integer> lista = new LinkedList<Integer>();
		this.numerosImparesMayoresQuePostOrden(lista, a, n);
		return lista;
	}

	private void numerosImparesMayoresQuePostOrden(List<Integer> l, GeneralTree<Integer> a, Integer n) {

		// primero los hijos
		List<GeneralTree<Integer>> children = a.getChildren();
		for (GeneralTree<Integer> child : children) {
			numerosImparesMayoresQuePostOrden(l, child, n);
		}

		// luego la raiz
		if (esImparMayorQue(a.getData(), n)) {
			l.add(a.getData());
		}
	}

	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> a, Integer n) {
		List<Integer> resultado = new LinkedList<>();
		Queue<GeneralTree<Integer>> cola = new Queue<>();
		GeneralTree<Integer> aG;
		cola.enqueue(a);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			if (((aG = cola.dequeue()) != null) && (!aG.isEmpty())) {

				if (esImparMayorQue(aG.getData(), n)) {
					resultado.add(aG.getData());
				}
				for (GeneralTree<Integer> gT : aG.getChildren()) {
					cola.enqueue(gT);
				}
			} else if (!cola.isEmpty()) {
				cola.enqueue(null);
			}
		}
		return resultado;
	}

	private boolean esImparMayorQue(Integer data, int n) {
		return (data % 2 != 0) && (data > n);
	}
}
