package linkedlist;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
	private Node<T> currentNode;

	public LinkedListIterator(Node<T> startingNode) {
		currentNode = startingNode;
	}

	@Override
	public boolean hasNext() {
		return currentNode != null;
	}

	@Override
	public T next() {
		if (!hasNext()) {
			throw new ArithmeticException();
		}
		T currentData = currentNode.getData();
		currentNode = currentNode.getNext();
		return currentData;
	}
}