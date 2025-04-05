package tp_1.ejercicio_3;

public class Test {

	public static void main(String[] args) {
		// defino arreglos
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];

		// creo objetos y asigno datos de prueba
		estudiantes[0] = crearEstudiante("Ricardo", "Vella", "Ricardo@bla.com", "test dir");
		estudiantes[1] = crearEstudiante("Prueba", "ApellidoEst", "test@bla.com", "dir");

		profesores[0] = crearProfesor("Profesor 1", "Apellido 1", "mail1@mail.com", "catedra 1", "facultad 1");
		profesores[1] = crearProfesor("Profesor 2", "Apellido 2", "mail2@mail.com", "catedra 2", "facultad 2");
		profesores[2] = crearProfesor("Profesor 3", "Apellido 3", "mail3@mail.com", "catedra 3", "facultad 3");

		// imprimir resultados
		for (Profesor profesor : profesores) {
			System.out.println(profesor.tusDatos());
		}
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.tusDatos());
		}
	}

	public static Estudiante crearEstudiante(String nombre, String apellido, String mail, String direccion) {
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(nombre);
		estudiante.setApellido(apellido);
		estudiante.setEmail(mail);
		estudiante.setDireccion(direccion);
		return estudiante;
	}

	public static Profesor crearProfesor(String nombre, String apellido, String mail, String catedra, String facultad) {
		Profesor profesor = new Profesor();
		profesor.setNombre(nombre);
		profesor.setApellido(apellido);
		profesor.setEmail(mail);
		profesor.setCatedra(catedra);
		profesor.setFacultad(facultad);

		return profesor;
	}

}
