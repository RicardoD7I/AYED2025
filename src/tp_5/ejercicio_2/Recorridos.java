package tp_5.ejercicio_2;

import java.util.ArrayList;
import java.util.List;

import tp_1.ejercicio_8.Queue;
import tp_5.ejercicio_1.Edge;
import tp_5.ejercicio_1.Graph;
import tp_5.ejercicio_1.Vertex;

public class Recorridos<T> {

	public List<T> dfs(Graph<T> grafo) {
		// lista de marcas
		Integer cantidadDeVertices = grafo.getSize();
		// Java lo inicializa en false por defecto
		boolean[] marcasVisitados = new boolean[cantidadDeVertices];
		// resultado del recorrido
		List<T> resultado = new ArrayList<T>();

		for (Vertex<T> vertice : grafo.getVertices()) {
			dfs(vertice, grafo, marcasVisitados, resultado);
		}

		return resultado;

	}

	private void dfs(Vertex<T> vertice, Graph<T> grafo, boolean[] marcasVisitados, List<T> resultado) {
		// marcar como visitado el vertice y actualizar lista de resultados
		marcasVisitados[vertice.getPosition()] = true;
		resultado.add(vertice.getData());

		for (Edge<T> arista : grafo.getEdges(vertice)) {
			Vertex<T> verticeAdyacente = arista.getTarget();
			if (!marcasVisitados[verticeAdyacente.getPosition()]) {
				dfs(verticeAdyacente, grafo, marcasVisitados, resultado);
			}
		}
	}

	public List<T> bfs(Graph<T> grafo) {
		List<T> resultado = new ArrayList<T>();
		boolean[] marcasVisitados = new boolean[grafo.getSize()];
		for (int i = 0; i < grafo.getSize(); i++) {
			if (!marcasVisitados[i]) {
				bfs(i, grafo, marcasVisitados, resultado);
			}
		}

		return resultado;

	}
	
	private void bfs(int posicionVertice, Graph<T> grafo, boolean[] marcasVisitados, List<T> resultado) {
		Queue<Vertex<T>> colaVertices = new Queue<Vertex<T>>();
		// obtener vertice, marcar como visitado y encolar
		Vertex<T> vertice = grafo.getVertex(posicionVertice);
		marcasVisitados[posicionVertice] = true;
		colaVertices.enqueue(vertice);

		// procesar cola
		while (!colaVertices.isEmpty()) {
			// obtengo un elemento de la cola y agregar al resultado
			Vertex<T> v = colaVertices.dequeue();
			resultado.add(v.getData());

			// obtener adyacentes y procesarlos
			List<Edge<T>> aristas = grafo.getEdges(v);
			for (Edge<T> arista : aristas) {
				
				// obtener vertice y su posicion en el grafo
				Vertex<T> verticeAdyacente = arista.getTarget();
				int posicionAdyacente = verticeAdyacente.getPosition();

				// si no esta visitado, marcarlo como visitado y encolarlo
				if (!marcasVisitados[posicionAdyacente]) {
					marcasVisitados[posicionAdyacente] = true;
					colaVertices.enqueue(verticeAdyacente);
				}
			}

		}
	}

}
