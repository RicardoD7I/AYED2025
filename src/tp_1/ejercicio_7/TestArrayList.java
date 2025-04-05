package tp_1.ejercicio_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tp_1.ejercicio_3.*;

public class TestArrayList {
	static List<Integer> numeros = new ArrayList<Integer>();
	// b. si en lugar de usar arrayList uso linkedList lo hago asi:
	// static List<Integer> numeros = new LinkedList<Integer>();

	public static void main(String[] args) {
		// agrega el iterador
		Iterator<Integer> iterator = null;

		// a.
		// guarda los elementos del arrayList
		for (int i = 0; i < args.length; i++) {
			int arg = Integer.parseInt(args[i]);
			numeros.add(arg);
		}

		// imprime los elementos de la lista con iterador
		iterator = numeros.iterator();
		while (iterator.hasNext()) {
			Integer element = iterator.next();
			System.out.println(element);
		}

		// c. formas de recorrer la lista
		// iterador, for, foreach, while
		// con for
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		// con foreach
		for (Integer elem : numeros) {
			System.out.println(elem);
		}

		// ejercicio D
		copiaLista();
	}

	private static void copiaLista() {
		List<Estudiante> listaOriginal = new ArrayList();
		List<Estudiante> listaCopia = new ArrayList();

		// crear lista con 3 estudiantes
		listaOriginal.add(crearEstudiante("Estudiante 1", "Apellido 1", "mail1", "direecion1"));
		listaOriginal.add(crearEstudiante("Estudiante 2", "Apellido 2", "mail2", "direecion2"));
		listaOriginal.add(crearEstudiante("Estudiante 3", "Apellido 3", "mail3", "direecion3"));

		// copiar lista a la otra
		listaCopia.addAll(listaOriginal);

		// muestro listas
		imprimir("Lista original:", listaOriginal);
		imprimir("Lista copia:", listaCopia);

		// cambio dato y muestro de nuevo
		listaOriginal.get(0).setNombre("CAMBIADO");
		listaCopia.get(0).setApellido("APELLIDO CAMBIADO");
		imprimir("Lista original:", listaOriginal);
		imprimir("Lista copia:", listaCopia);

		// conclusiones: se modifica tanto la lista original como la copia
		// existen 3 formas: con el constructor, metodo addAll y con el clone()

		// punto E
		Estudiante nuevoEstudiante = crearEstudiante("Nuevo estudiante", "Apellido 4", "mail4", "direecion4");
		if (!listaOriginal.contains(nuevoEstudiante)) {
			listaOriginal.add(nuevoEstudiante);
		}
		
		// punto F
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(2);

		boolean esCapicuaLaLista = esCapicua(listaNumeros);
		System.out.println((esCapicuaLaLista) ? "La Lista ES capicua" : "La Lista NO ES capicua");
		
		// punto G
		
	}

	public static Estudiante crearEstudiante(String nombre, String apellido, String mail, String direccion) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(nombre);
		estudiante.setApellido(apellido);
		estudiante.setEmail(mail);
		estudiante.setDireccion(direccion);
		return estudiante;
	}

	private static void imprimir(String titulo, List<Estudiante> lista) {
		Iterator<Estudiante> iterador = lista.iterator();
		System.out.println(titulo);
		while (iterador.hasNext()) {
			Estudiante element = iterador.next();
			System.out.println(element.tusDatos());
		}
		System.out.println("");
	}

	public static boolean esCapicua(ArrayList<Integer> lista) {
		return esCapicuaRecursivo(lista, 0);
	}

	private static boolean esCapicuaRecursivo(ArrayList<Integer> lista, int pos) {
		boolean resultado = false;
		if (pos < (lista.size() / 2)) {
			Integer elementListaOpuesto = lista.get(lista.size() - pos - 1);
			boolean cumpleCondicion = lista.get(pos).equals(elementListaOpuesto);
			resultado = esCapicuaRecursivo(lista, pos + 1) && cumpleCondicion;
		} else {
			resultado = !lista.isEmpty();
		}

		return resultado;

	}

}
