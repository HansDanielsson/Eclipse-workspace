package linkedlist;

public class Node<E> {
	private E info;
	private Node<E> next;
	private Node<E> prev;

	public Node() {
		this.next = null;
		this.prev = null;
	}

	public Node(E info) {
		this();
		this.info = info;
	}

	public E getInfo() {
		return this.info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public Node<E> getNext() {
		return this.next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPrev() {
		return this.prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
}