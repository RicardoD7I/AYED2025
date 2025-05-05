package tp_3.ejercicio_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tp_3.ejercicio_1.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> arbol;

	public Caminos(GeneralTree<Integer> ab) {
		arbol = ab;
	}

	public List<Integer> caminoAHojaMasLejana() {
		if (this.arbol.isEmpty()) return null;
		else return caminoAHojaMasLejana(this.arbol);

	}
	
	public List<Integer> caminoAHojaMasLejana(GeneralTree<Integer> nodo) {
		
		List<Integer> camino = new LinkedList<Integer>();
		camino.add(nodo.getData());
		List<Integer> caminoParcial = new ArrayList<Integer>();
		for (GeneralTree<Integer> hijo : nodo.getChildren()) {
			List<Integer> caminoHijo = new ArrayList<Integer>();
			caminoHijo.addAll(caminoAHojaMasLejana(hijo));
			
			if (caminoHijo.size() > caminoParcial.size()) {
				caminoParcial = caminoHijo;
			}
		}
		camino.addAll(caminoParcial);
		return camino;

	}
}
