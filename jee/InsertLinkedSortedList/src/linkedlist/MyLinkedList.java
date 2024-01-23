package linkedlist;

public class MyLinkedList<E extends Comparable<E>> {

	// Notice that stating E extends Comparable<E> is needed, as we should use
	// compareTo for inserting in a sorted way
	private Node<E> first;

	public MyLinkedList() {
		first = null;
	}

	/*
	 * Insertion at the beginning Change this method to insert the values in a
	 * sorted way
	 */
	public void insert(E info) {
		Node<E> newNode = new Node<>(info);
		Node<E> current = first;
		Node<E> nextNode;
		if (first == null) {
			first = newNode;
		} else if (first.getNext() == null) {
			if (first.getInfo().compareTo(info) < 0) {
				first.setNext(newNode);
			} else {
				newNode.setNext(first);
				first = newNode;
			}
		} else if (first.getInfo().compareTo(info) > 0) {
			newNode.setNext(first);
			first = newNode;
		} else {
			nextNode = first.getNext();
			while ((nextNode != null) && (nextNode.getInfo().compareTo(info) < 0)) {
				current = current.getNext();
				nextNode = nextNode.getNext();
			}
			newNode.setNext(nextNode);
			current.setNext(newNode);
		}
	}

	/*
	 * Extraction of the first node
	 */
	public E extract() {
		E data = null;
		if (first != null) {
			data = first.getInfo();
			first = first.getNext();
		}
		return data;
	}

	/*
	 * Print all list
	 */
	public void print() {
		Node<E> current = first;

		while (current != null) {
			System.out.print(current.getInfo() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}