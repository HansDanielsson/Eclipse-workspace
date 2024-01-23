package arrayqueue;

public class ArrayQueue<T> {
	private static final int INITIAL_CAPACITY = 2;
	private Object[] arrayq;
	private int size;
	private int front;

	public ArrayQueue() {
		arrayq = new Object[INITIAL_CAPACITY];
		size = 0;
		front = 0;
	}

	public T dequeue() {
		T result = null;
		if (size > 0) {
			result = (T) arrayq[front];
			arrayq[front] = null;
			front = (front + 1) % arrayq.length;
			size--;
		}
		return result;
	}

	public void enqueue(T data) {
		int current = (front + size) % arrayq.length;
		if (current == front) {
			Object[] arrayNew = new Object[2 * arrayq.length];
			for (int i = 0; i < size; i++) {
				current = (front + i) % arrayq.length;
				arrayNew[i] = arrayq[current];
			}
			arrayq = arrayNew;
			front = 0;
		}
		current = (front + size) % arrayq.length;
		arrayq[current] = data;
		size++;
	}
}