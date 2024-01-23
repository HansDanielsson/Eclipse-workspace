package linkedlist;

public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T inData, Node<T> inNext) {
		data = inData;
		next = inNext;
	}

	public Node(T inData) {
		this(inData, null);
	}

	public T getData() {
		return data;
	}

	public void setData(T inData) {
		data = inData;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> inNode) {
		next = inNode;
	}
}