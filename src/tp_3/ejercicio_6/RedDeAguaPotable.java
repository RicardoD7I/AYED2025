package tp_3.ejercicio_6;

import java.util.List;

import tp_3.ejercicio_1.GeneralTree;

public class RedDeAguaPotable {

	private GeneralTree<Character> red;

	public RedDeAguaPotable(GeneralTree<Character> red) {
		this.red = red;
	}

	public double minimoCaudal(double caudal) {
		

		return minimoCaudal(this.red, caudal);
	}
	
	private double minimoCaudal(GeneralTree<Character> nodo, double caudal) {
		
		if(nodo.isLeaf()) return caudal;
		
		int cantidadDeHijos = 0;
		double caudalBifurcado = caudal;
		double caudalMinimo =  Double.MAX_VALUE;
		if (nodo.hasChildren()) {
			List<GeneralTree<Character>> hijos = nodo.getChildren();
			cantidadDeHijos = hijos.size();
			caudalBifurcado = caudal / cantidadDeHijos;
			for (GeneralTree<Character> hijo : hijos) {
				double caudalDeSubRed = minimoCaudal(hijo, caudalBifurcado);
				caudalMinimo = Math.min(caudalDeSubRed, caudalMinimo);
			}
		}

		return caudalMinimo;
	}

}
