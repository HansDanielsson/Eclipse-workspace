package queue;

/**
 * Class that implements a Deque with a Double Linked List.
 *
 * @author DIT-UC3M
 *
 */
public class DLDqueue implements Dqueue {
	private DNode head;
	private DNode tail;
	private int size;

	public DLDqueue() {
		head = new DNode();
		tail = new DNode();
		head.setNext(tail);
		tail.setPrev(head);
		size = 0;
	}

	public void insertFirst(Object obj) {
		DNode node = new DNode(obj, head, null);
		head.setPrev(node);
		head = node;
		if (size == 0)
			tail = node;
		size++;
	}

	public void insertLast(Object obj) {
		DNode node = new DNode(obj, null, tail);
		tail.setNext(node);
		tail = node;
		if (size == 0)
			head = node;
		size++;
	}

	public Object removeFirst() {
		if (size == 0)
			return null;
		Object val = head.getVal();
		head = head.getNext();
		size--;
		return val;
	}

	public Object removeLast() {
		if (size == 0)
			return null;
		Object val = tail.getVal();
		tail = tail.getPrev();
		size--;
		return val;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		String s = "head [";
		DNode aux = head;
		for (int i = 0; i < size; i++) {
			s += aux.getVal();
			if (aux == tail) {
				break;
			}
			s += "-";
			aux = aux.getNext();
		}
		return s + "] tail";
	}
}