package queue;

public class DLDqueue {

	// Attributes
	private DNode top;
	private DNode tail;
	private int size;

	public DLDqueue() {
		top = new DNode();
		tail = new DNode();
		tail.setPrev(top);
		top.setNext(tail);
		size = 0;
	}

	public void insertFirst(Object obj) {
		DNode second = top.getNext();
		DNode first = new DNode(obj, top, second);
		second.setPrev(first);
		top.setNext(first);
		size++;
	}

	public void insertLast(Object obj) {
		DNode nextlast = tail.getPrev();
		DNode last = new DNode(obj, tail, nextlast);
		nextlast.setNext(last);
		tail.setPrev(last);
		size++;
	}

	public Object removeFirst() {
		if (size == 0) {
			return null;
		}
		DNode first = top.getNext();
		DNode second = first.getNext();
		top.setNext(second);
		second.setPrev(top);
		size--;
		return first.getVal();
	}

	public Object removeLast() {
		if (size == 0) {
			return null;
		}
		DNode last = tail.getPrev();
		DNode second = last.getPrev();
		tail.setPrev(second);
		second.setNext(tail);
		size--;
		return last.getVal();
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "";
	}

	public static void main(String[] args) {
	}
}