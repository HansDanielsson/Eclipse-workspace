package queue;

public class LinkedQueue<E> implements Queue<E> {
	// Attributes
	private Node<E> top;
	private Node<E> tail;
	private int size;

	public LinkedQueue() {
		top = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public E front() {
		if (isEmpty()) {
			return null;
		} else {
			return top.getInfo();
		}
	}

	public void enqueue(E info) {
		Node<E> n = new Node<>(info, null);
		if (isEmpty()) {
			top = n;
		} else {
			tail.setNext(n);
		}
		tail = n;
		size++;
	}

	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		E tmp = top.getInfo();
		top = top.getNext();
		size--;
		if (isEmpty()) {
			tail = null;
		}
		return tmp;
	}

	public static void main(String[] args) {

		LinkedQueue<Integer> q = new LinkedQueue<>();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		System.out.println("Size: " + q.size());

		Integer e = q.front();
		System.out.println("Size: " + q.size());
		System.out.println(e);

		e = q.dequeue();
		e = q.dequeue();
		System.out.println("Size: " + q.size());

		e = q.dequeue();
		e = q.dequeue();
		e = q.dequeue();
		System.out.println("Size: " + q.size() + " isEmpty: " + q.isEmpty());

	}
}