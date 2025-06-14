package tp_5.ejercicio_5;

import tp_5.ejercicio_1.Graph;
import tp_5.ejercicio_1.Vertex;
import tp_5.ejercicio_1.adjList.AdjListGraph;

public class Ejercicio {
	public static void main (String[] args) {
		 Graph<Persona> grafo = new AdjListGraph<>();
	        Vertex v1 = grafo.createVertex(new Persona("Empleado", "Matias", "AAA", true));
	        Vertex v2 = grafo.createVertex(new Persona("Jubilado", "Julian", "BBB", false));
	        Vertex v3 = grafo.createVertex(new Persona("Jubilado", "Francisco", "CCC", false));
	        Vertex v4 = grafo.createVertex(new Persona("Empleado", "Valentin", "DDD", true));
	        Vertex v5 = grafo.createVertex(new Persona("Jubilado", "Omar", "EEE", true));
	        Vertex v6 = grafo.createVertex(new Persona("Empleado", "Rosana", "FFF", true));
	        Vertex v7 = grafo.createVertex(new Persona("Jubilado", "Maria", "GGG", false));
	        Vertex v8 = grafo.createVertex(new Persona("Jubilado", "Sandra", "HHH", true));
	        Vertex v9 = grafo.createVertex(new Persona("Jubilado", "Matheo", "III", false));

	        grafo.connect(v1, v2);
	        grafo.connect(v2, v1);
	        grafo.connect(v2, v3);
	        grafo.connect(v3, v2);
	        
	        grafo.connect(v1, v9);
	        grafo.connect(v9, v1);
	        grafo.connect(v9, v8);
	        grafo.connect(v8, v9);
	        
	        grafo.connect(v1, v4);
	        grafo.connect(v4, v1);
	        grafo.connect(v1, v6);
	        grafo.connect(v6, v1);
	        grafo.connect(v4, v5);
	        grafo.connect(v5, v4);
	        grafo.connect(v5, v7);
	        grafo.connect(v7, v5);
	        
	        
	        
	        QuedateEnCasa campaign = new QuedateEnCasa();
	        

	        System.out.println(campaign.buscarJubilados(grafo, "Matias", 5, 40));
	 
		}

}
