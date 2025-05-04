package tp_3.ejercicio_4;

import tp_3.ejercicio_1.GeneralTree;

public class Ejercicio {

	public static void main(String[] args) {
		GeneralTree<AreaEmpresa> arbol = getArbolEjemplo();
		AnalizadorArbol analizador = new AnalizadorArbol();
		
		double resultado = analizador.devolverMaximoPromedio(arbol);
		
		System.out.println("Mayor promedio entre todos los niveles: " + resultado);
	}

	private static GeneralTree<AreaEmpresa> getArbolEjemplo() {
		// nivel 0
		GeneralTree<AreaEmpresa> raiz = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M", 14));		
		
		// nivel 1
		GeneralTree<AreaEmpresa> nodo_1 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("J", 13));		
		GeneralTree<AreaEmpresa> nodo_2 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("K", 25));		
		GeneralTree<AreaEmpresa> nodo_3 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("L", 10));		
		
		// nivel 2
		GeneralTree<AreaEmpresa> nodo_4 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("A", 4));		
		GeneralTree<AreaEmpresa> nodo_5 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("B", 7));		
		GeneralTree<AreaEmpresa> nodo_6 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("C", 5));		
		GeneralTree<AreaEmpresa> nodo_7 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("D", 6));		
		GeneralTree<AreaEmpresa> nodo_8 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("E", 10));		
		GeneralTree<AreaEmpresa> nodo_9 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("F", 18));		
		GeneralTree<AreaEmpresa> nodo_10 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("G", 9));		
		GeneralTree<AreaEmpresa> nodo_11 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("H", 12));		
		GeneralTree<AreaEmpresa> nodo_12 = new GeneralTree<AreaEmpresa>(new AreaEmpresa("I", 19));		

		// agregar hijos (crear aristas)
		raiz.addChild(nodo_1);
		raiz.addChild(nodo_2);
		raiz.addChild(nodo_3);
		
		nodo_1.addChild(nodo_4);
		nodo_1.addChild(nodo_5);
		nodo_1.addChild(nodo_6);
		
		nodo_2.addChild(nodo_7);
		nodo_2.addChild(nodo_8);	
		nodo_2.addChild(nodo_9);
		
		nodo_3.addChild(nodo_10);		
		nodo_3.addChild(nodo_11);
		nodo_3.addChild(nodo_12);
		
		return raiz;
	}
}
