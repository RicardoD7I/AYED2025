package tp_1.ejercicio_8;

public class Ejercicio {
	public static void main(String[] args) {
		Queue<Integer> cola = new Queue<Integer>();
		

		System.out.print ("isEmpty?: ");
		System.out.println(cola.isEmpty());
		System.out.print ("Size: ");
		System.out.println(cola.size());

		// agrego elementos
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		
		System.out.print ("toString: ");
		System.out.println(cola.toString());
		System.out.print ("Head: ");
		System.out.println(cola.head());
		System.out.print ("isEmpty: ");
		System.out.println(cola.isEmpty());
		System.out.print ("Size: ");
		System.out.println(cola.size());

		
		Integer element = cola.dequeue();
		System.out.print ("elemento desencolado: ");
		System.out.println(element);
		System.out.print ("toString: ");
		System.out.println(cola.toString());

	}
}
