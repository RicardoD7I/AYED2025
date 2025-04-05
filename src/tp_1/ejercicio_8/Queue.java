package tp_1.ejercicio_8;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> extends Sequence {

	private List<T> data;

	public Queue() {
		data = new LinkedList<T>();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	public void enqueue(T dato) {
		data.add(dato);
	}

	public T dequeue() {
		T result = null;
		if (!isEmpty()) {
			result = data.removeFirst();
		}
		return result;

	}

	public T head() {
		T result = null;
		if (!isEmpty()) {
			result = data.getFirst();
		}
		return result;

	}

	public String toString() {
		return data.toString();

	}
}
