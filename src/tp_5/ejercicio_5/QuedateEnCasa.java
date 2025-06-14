package tp_5.ejercicio_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp_1.ejercicio_8.Queue;
import tp_5.ejercicio_1.Edge;
import tp_5.ejercicio_1.Graph;
import tp_5.ejercicio_1.Vertex;

public class QuedateEnCasa {
	// busqueda en amplitud

	public List<Jubilado> buscarJubilados(Graph<Persona> grafo, String nombreEmpleado, int grado, int maxList) {
		// resultados
		List<Jubilado> jubilados = new LinkedList<Jubilado>();

		// si no esta vacio el grafo
		if (!grafo.isEmpty()) {
			// si en el grafo hay un vertice con el nombre buscado
			Vertex<Persona> emp = this.buscarEmpleado(grafo, nombreEmpleado);
			if (emp != null) {
				// creo una cola para procesar los datos por niveles
				// y un vector para marcar visitados
				Queue<Vertex<Persona>> c = new Queue<Vertex<Persona>>();
				boolean[] marcas = new boolean[grafo.getSize()];

				// mientras tenga datos en la cola y no supere el maximo de resultados requerido
				// por paramentro
				while (!c.isEmpty() && grado > 0 && jubilados.size() < maxList) {
					// desencolo el vertice
					Vertex<Persona> v = c.dequeue();
					// si es una marca de nivel
					if (v != null) {
						// obtengo las aristas del vertice desencolado
						List<Edge<Persona>> adys = grafo.getEdges(v);
						Iterator<Edge<Persona>> it = adys.iterator();
						// mientras tenga una arista y no supere la maxima cantidad de resultados pedida
						while (it.hasNext() && jubilados.size() < maxList) {
							// obtengo el vertice destino de la arista
							Vertex<Persona> vertDestino = it.next().getTarget();
							int posDestino = vertDestino.getPosition();
							// si no fue visitado ya el vertice
							if (!marcas[posDestino]) {
								// lo marco como visitado y lo encolo
								marcas[posDestino] = true;
								c.enqueue(vertDestino);
								// si cumple con la condicion de ser un jubilado
								if (vertDestino.getData().cumple()) {
									// lo agrego a la lista de jubilados
									jubilados.add(new Jubilado(vertDestino.getData().getNombre(),
											vertDestino.getData().getDomicilio()));
								}
							}
						}
					} else if (!c.isEmpty()) {
						grado--;
						c.enqueue(null);
					}
				}
			}
		}

		return jubilados;

	}

	private Vertex<Persona> buscarEmpleado(Graph<Persona> grafo, String nombreEmpleado) {
		List<Vertex<Persona>> vertices = grafo.getVertices();
		Iterator<Vertex<Persona>> it = vertices.iterator();
		Vertex<Persona> per = null;
		boolean sigo = true;
		while ((it.hasNext()) && (sigo)) {
			Vertex<Persona> aux = it.next();
			if (aux.getData().getNombre().equals(nombreEmpleado)) {
				per = aux;
				sigo = false;
			}
		}
		return per;
	}

}
