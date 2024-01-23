package linkedlist;

import java.util.Iterator;

public class LinkedList<T> extends Node<T> implements Iterable<T> {
	public Node<T> head = null;

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<>(head);
	}
}