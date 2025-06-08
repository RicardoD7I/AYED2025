package tp_5.ejercicio_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp_5.ejercicio_1.Edge;
import tp_5.ejercicio_1.Graph;
import tp_5.ejercicio_1.Vertex;

public class VisitaOslo {

	public List<String> paseoEnBici(Graph<String> lugares, String destino, int maxTiempo,
			List<String> lugaresRecorridos) {
		List<String> camino = new LinkedList<String>();
		boolean[] marcasVisitados = new boolean[lugares.getSize()];
		Vertex<String> inicio = lugares.search("Ayuntamiento");
		Vertex<String> fin = lugares.search(destino);
		reestringirLugares(marcasVisitados, lugaresRecorridos, lugares);
		dfs(lugares, marcasVisitados, inicio, fin, maxTiempo, camino);
		return camino;

	}

	private boolean dfs(Graph<String> lugares, boolean[] marcasVisitados, Vertex<String> inicio, Vertex<String> fin,
			int maxTiempo, List<String> camino) {

		boolean encontrado = false;
		// marco como visitado este vertice
		marcasVisitados[inicio.getPosition()] = true;
		// agregar al camino
		camino.add(inicio.getData());

		// condicion de corte
		if (inicio == fin) {
			return true; // encontre el camino desde inicio hasta fin
		} else {
			List<Edge<String>> aristas = lugares.getEdges(inicio);
			Iterator<Edge<String>> iterador = aristas.iterator();
			while (iterador.hasNext() && !encontrado) {
				Edge<String> arista = iterador.next();
				int numeroVertice = arista.getTarget().getPosition();
				int tiempoArista = arista.getWeight();
				if (!marcasVisitados[numeroVertice] && (maxTiempo - tiempoArista >= 0)) {
					encontrado = dfs(lugares, marcasVisitados, arista.getTarget(), fin, maxTiempo - tiempoArista, camino);
				}
			}

		}
		
		if (!encontrado) {
			camino.remove(camino.size() - 1);
		}
		marcasVisitados[inicio.getPosition()] = false;

		return encontrado;
	}

	private void reestringirLugares(boolean[] marcasVisitados, List<String> lugares, Graph<String> grafo) {
		for (String lugar : lugares) {
			// busco el vertice
			Vertex<String> vertice = grafo.search(lugar);
			// lo marco como visitado, para reestringirlo
			marcasVisitados[vertice.getPosition()] = true;
		}
	}

}
