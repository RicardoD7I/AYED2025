package tp_5.ejercicio_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tp_5.ejercicio_1.Edge;
import tp_5.ejercicio_1.Graph;
import tp_5.ejercicio_1.Vertex;
import tp_5.ejercicio_1.adjList.AdjListGraph;

public class Mapa {
	// DFS practica

	private Graph<String> mapa = new AdjListGraph<String>();

	public Mapa(Graph<String> g) {
		this.mapa = g;
	}

	public List<String> devolverCamino(String ciudad1, String ciudad2) {
		Vertex<String> origen = mapa.search(ciudad1);
		Vertex<String> destino = mapa.search(ciudad1);
		List<String> resultado = new ArrayList<String>();
		boolean[] visitados = new boolean[mapa.getSize()];
		devolverCamino(origen, destino, resultado, visitados);
		return resultado;
	}

	private boolean devolverCamino(Vertex<String> origen, Vertex<String> destino, List<String> camino,
			boolean[] marcas) {
		boolean encontrado = false;

		marcas[origen.getPosition()] = true;
		camino.add(origen.getData());

		// si llegue a un vertice que es igual al destino (se mueve el origen hacia el
		// destino)
		if (origen == destino) {
			// lo encontre
			return true;
		} else {
			List<Edge<String>> ady = this.mapa.getEdges(origen);
			Iterator<Edge<String>> it = ady.iterator();
			while (it.hasNext() && !encontrado) {
				Vertex<String> v = it.next().getTarget();
				int j = v.getPosition();
				if (!marcas[j]) {
					encontrado = devolverCamino(v, destino, camino, marcas);
				}
			}
		}
		// si no lo encontre quito el ultimo elemento
		if (!encontrado) {
			camino.remove(camino.size() - 1);
		}
		// Deja desmarcadas todas las posiciones del vector de marcas: 
		// no es necesario desmarcar en este ejemplo

		marcas[origen.getPosition()] = false;
		return encontrado;

	}

	public List<String> devolverCaminoExceptuando(String ciudad1, String ciudad2, List<String> ciudades) {
		
		Vertex<String> origen = mapa.search(ciudad1);
		Vertex<String> destino = mapa.search(ciudad1);
		List<String> resultado = new ArrayList<String>();
		boolean[] visitados = new boolean[mapa.getSize()];
		filtrarVertices(ciudades, visitados);
		devolverCamino(origen, destino, resultado, visitados);
		return resultado;
		
	}

	private void filtrarVertices(List<String> ciudades, boolean[] visitados) {
		for (String ciudad: ciudades) {
			Vertex<String> vertice = mapa.search(ciudad);
			if (vertice != null) {
				visitados[vertice.getPosition()] = true;
			}
		}
		
	}

	public List<String> caminoMasCorto(String ciudad1, String ciudad2) {
		return null;

	}

	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto) {
		return null;

	}

	public List<String> caminoConMenorCargaDeCombustible(String ciudad1, String ciudad2, int tanqueAuto) {
		return null;

	}
}
