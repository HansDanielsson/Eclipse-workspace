package queue;

/**
 * Universidad Carlos III de Madrid
 * Departamento de Ingenieria Telematica.
 * Int queue
 * 2017
 */

/**
 * Int Queue
 */
public class Queue {

	/** Max num elements */
	private int numElements;

	/** Array to save elements **/
	private int[] elements;

	/** Indice to last element */
	private int last;

	/** Constructor to init the state object */
	public Queue(int numElements) {
		this.numElements = numElements;
		elements = new int[numElements];
		last = -1;
	}

	/** Is empty the queue? */
	public boolean isEmpty() {
		return last == -1;
	}

	/** Is full the queue */
	public boolean isFull() {
		return last == numElements;
	}

	/** Insert an element in the queue */
	public void enqueue(int element) {
		elements[++last] = element;
	}

	/**
	 * Extract the element in the queue. There isn't control error
	 */
	public int dequeue() {
		int result = elements[0];
		for (int i = 0; i < last; i++) {
			elements[i] = elements[i+1];
		}
		last--;
		return result;
	}

	/** Returns the number of elements in the queue */
	public int numElements() {
		return last+1;
	}

	/** Print the elements in the queue */
	public void print() {
		for (int i = 0; i <= last; i++) {
			System.out.println(i + " :" + elements[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(4);
		System.out.println("Test the queue class");
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		q.print();
		q.dequeue();
		q.print();
	}
}