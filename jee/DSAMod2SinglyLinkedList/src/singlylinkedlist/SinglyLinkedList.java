package singlylinkedlist;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public void addToFront(T data) {
		if (data == null) {
			throw new IllegalArgumentException("Error: addToFront(null)");
		} else {
			Node<T> node = new Node<>(data, head);
			if (tail == null) {
				tail = node;
			}
			head = node;
		}
	}

	public void addToBack(T data) {
		if (data == null) {
			throw new IllegalArgumentException("Error: addToFront(null)");
		} else {
			Node<T> node = new Node<>(data);
			if (head == null) {
				head = node;
			} else {
				tail.setNext(node);
			}
			tail = node;
		}
	}

	public T removeFromFront() {
		T data = null;
		if (head != null) {
			data = head.getData();
			Node<T> current = head.getNext();
			head.setNext(null);
			head = current;
			if (head == null) {
				tail = null;
			}
		}
		return data;
	}

	public T removeFromBack() {
		T data = null;
		if (tail != null) {
			Node<T> current = head;
			Node<T> prev = head;
			while (current != tail) {
				prev = current;
				current = current.getNext();
			}
			data = current.getData();
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				tail = prev;
				tail.setNext(null);
			}
		}
		return data;
	}
}