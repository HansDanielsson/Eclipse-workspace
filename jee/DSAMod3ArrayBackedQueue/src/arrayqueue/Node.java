package arrayqueue;

public class Node<T> {
	private T data;

	public Node(T data) {
		this.data = data;
	}
	
	public Node() {
		data = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}