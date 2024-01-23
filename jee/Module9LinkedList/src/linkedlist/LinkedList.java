package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void addAtIndex(T data, int index) {
		if ((index < 0) || (index > size)) {
			throw new IllegalArgumentException("Your index is out of the list bounds");
		} else if (data == null) {
			throw new IllegalArgumentException("You cannot add null data to the list");
		} else {
			Node<T> node = new Node<>(data);
			Node<T> current = head;
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			if (current == null) {
				head = node;
				tail = node;
			} else if (index == 0) {
				node.setNext(head);
				head = node;
			} else {
				node.setNext(current.getNext());
				if (current.getNext() == null) {
					tail = node;
				}
				current.setNext(node);
			}
			size++;
		}
	}

	public T getAtIndex(int index) {
		T data = null;
		if ((index < 0) || (index > size - 1)) {
			throw new IllegalArgumentException("Your index is out of the list bounds");
		} else {
			Node<T> current = head;
			for (int i = 1; i < index; i++) {
				current = current.getNext();
			}
			data = current.getData();
		}
		return data;
	}

	public T removeAtIndex(int index) {
		T result = null;
		if ((index < 0) || (index > size - 1)) {
			throw new IllegalArgumentException("Your index is out of bounds");
		} else {
			if (index == 0) {
				result = head.getData();
				head = head.getNext();
			} else {
				Node<T> sentinel = head;
				Node<T> current = head;
				for (int i = 0; i < index; i++) {
					sentinel = current;
					current = current.getNext();
				}
				result = current.getData();
				sentinel.setNext(current.getNext());
				if (current == tail) {
					tail = sentinel;
				}
			}
			if ((head == null) || (tail == null)) {
				head = null;
				tail = null;
			}
			size--;
		}
		return result;
	}

	public T remove(T data) {
		T result = null;
		if (data == null) {
			throw new IllegalArgumentException("You cannot remove null data from the list");
		} else {
			boolean found = false;
			Node<T> current = head;
			int currPos = 0;
			while ((current != null) && !found) {
				if (current.getData().equals(data)) {
					found = true;
					removeAtIndex(currPos);
				} else {
					current = current.getNext();
					currPos++;
				}
			}
			if (!found) {
				throw new NoSuchElementException("The data is not present in the list.");
			}
		}
		return result;
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}
}