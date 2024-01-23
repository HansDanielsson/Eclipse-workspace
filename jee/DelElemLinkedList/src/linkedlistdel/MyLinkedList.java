package linkedlistdel;

public class MyLinkedList<E> {
	
	private Node<E> first;

	public MyLinkedList() {
		this.first = null;
	}

	/*
	 * Insertion at the beginning
	 */
	public void insert(E info) {
		Node<E> newNode = new Node<>(info);
		newNode.setNext(first);
		first = newNode;
	}

	/*
	 * Delete the first occurrence of a value Return a boolean stating if the delete
	 * was successful
	 */
	public boolean deleteFirstOccurrence(E info) {
		boolean success = false;
		// Implement this Method
		Node<E> current = first;
		if (current != null) {
			if (current.getInfo() == info) {
				first = current.getNext();
				success = true;
			}
			while (!success && current.getNext() != null) {
				if (current.getNext().getInfo() == info) {
					current.setNext(current.getNext().getNext());
					success = true;
				}
				current = current.getNext();
			}
		}
		return success;
	}

	/*
	 * Delete all the occurrences of a value Returns the number of deleted nodes You
	 * can use deleteFirstOccurrence
	 */
	public int deleteAll(E info) {
		int number = 0;
		// Implement this method
		while (deleteFirstOccurrence(info)) {
			number++;
		}
		return number;
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