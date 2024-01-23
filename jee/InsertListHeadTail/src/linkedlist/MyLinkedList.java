package linkedlist;

public class MyLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * Insertion at the beginning
	 */
	public void insert(E info) {
		Node<E> newNode = new Node<>(info);
		newNode.setNext(head);
		head = newNode;
		if (tail == null) {
			tail = newNode;
		}
	}

	/*
	 * Insertion at the end Implement this method
	 */
	public void insertEnd(E info) {
		// Implement this method
		Node<E> newNode = new Node<>(info);
		if (tail != null) {
			tail.setNext(newNode);
		}
		tail = newNode;
		if (head == null) {
			head = newNode;
		}
	}

	/*
	 * Extraction of the first node
	 */
	public E extract() {
		E data = null;
		// Implement this method
		if (head != null) {
			data = head.getInfo();
			head = head.getNext();
		}
		return data;
	}

	/*
	 * Extraction of the last node Implement this method
	 */
	public E extractEnd() {
		E data = null;
		// Implement this method
		Node<E> current = head;
		while ((current != null) && (current.getNext() != tail)) {
			current = current.getNext();
		}
		if (tail != null) {
			data = tail.getInfo();
		}
		if (current != null) {
			current.setNext(null);
		}
		tail = current;
		if (tail == null) {
			head = null;
		}
		return data;
	}

	/*
	 * Print all list
	 */
	public void print() {
		Node<E> current = head;

		while (current != null) {
			System.out.print(current.getInfo() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}