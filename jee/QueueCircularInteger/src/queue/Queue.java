package queue;

/**
 * Universidad Carlos III de Madrid
 * Departamento de Ingenieria Telematica.
 * Int circular queue
 * 2017
 */

/**
 * Int Queue
 */
public class Queue {

	/** Number of element in the queue */
	private int numElements;
	private int capacity;

	/** Array to save elements **/
	private int[] elements;

	/** Indice to last element */
	private int head;
	private int tail;

	// Add one position and calculates if we must return the first position array.
	// Module opertion (%) is very important for this.
	private int next(int pos) {
		return (pos + 1) % (capacity + 1);
	}

	/** Constructor to init the state object */
	public Queue(int capacity) {
		numElements = 0;
		this.capacity = capacity;
		// We must create the array with an extra element to control the conditions
		// empty and full
		elements = new int[capacity + 1];
		tail = capacity;
		head = capacity;
	}

	/** Is empty the queue? */
	public boolean isEmpty() {
		return numElements == 0;
	}

	/** Is full the queue */
	public boolean isFull() {
		return numElements == capacity;
	}

	/** Insert an element in the queue */
	public void enqueue(int element) {
		numElements++;
		tail = next(tail);
		elements[tail] = element;
	}

	/**
	 * Extract the element in the queue. There isn't control error
	 */
	public int dequeue() {
		numElements--;
		head = next(head);
		return elements[head];

	}

	/** Returns the number of elements in the queue */
	public int numElements() {
		return numElements;
	}

	/** Print the elements in the queue */
	public void print() {

		System.out.print("Head: " + head + " Tail: " + tail + " Number Elements: " + numElements + ": ");
		// from head to tail
		int i = next(head);
		int counter = 0;
		while (counter < numElements) {
			System.out.print(elements[i] + "-");
			i = next(i);
			counter++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Five elements maximum in the queue
		Queue queue = new Queue(5);

		System.out.println("Is empty?: " + queue.isEmpty());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("Is full?: " + queue.isFull());

		queue.dequeue();
		queue.dequeue();

		queue.print();

		queue.dequeue();
		queue.dequeue();

		queue.print();

		queue.dequeue();

		queue.print();

		queue.enqueue(1);

		queue.print();

		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		queue.print();

		System.out.println("Is empty?: " + queue.isEmpty());
		System.out.println("Is full?: " + queue.isFull());
	}
}