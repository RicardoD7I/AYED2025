package tp_3.ejercicio_4;

import java.util.List;

import tp_1.ejercicio_8.Queue;
import tp_3.ejercicio_1.GeneralTree;

public class AnalizadorArbol {

	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		// si esta vacio o la raiz es hoja resolverlo de inmediato
		if (arbol.isEmpty())
			return 0;
		else if (arbol.isLeaf())
			return arbol.getData().getTardanza();
		
		// algoritmo iterativo por niveles, 
		
		// variables de totales (resultados)
		double maximoPromedioDeNivel = -1;
		// variables parciales que necesito para resolver el problema
		double cantidadNodosPorNivel = 0;
		double suma = 0;
		
		// variables propias del algoritmo por niveles
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		GeneralTree<AreaEmpresa> nodo = new GeneralTree<AreaEmpresa>();
		
		// encolo raiz y marca de fin de nivel
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while (!cola.isEmpty()) {
			// obtengo un nodo de la cola
			nodo = cola.dequeue();
			if (nodo != null) {
				// actualizo las variables parciales del problema
				cantidadNodosPorNivel ++;
				suma += nodo.getData().getTardanza();
				
				// encolo los hijos
				List<GeneralTree<AreaEmpresa>> hijos = nodo.getChildren();
				for (GeneralTree<AreaEmpresa> hijo : hijos) {
					cola.enqueue(hijo);
				}
				
			} else if (!cola.isEmpty()) {
				// actualizo totales
				suma = suma / cantidadNodosPorNivel;
				maximoPromedioDeNivel = Math.max(cantidadNodosPorNivel, suma);
				
				// reseteo variables parciales para el proximo nivel
				suma = 0;
				cantidadNodosPorNivel = 0;
				
				// encolo marca de fin de nivel
				cola.enqueue(null);
				
			}
		}

		// devuelvo lo que se pide
		return maximoPromedioDeNivel;
	}
}
