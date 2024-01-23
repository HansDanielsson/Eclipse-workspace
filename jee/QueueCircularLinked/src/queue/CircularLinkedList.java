package queue;

public class CircularLinkedList {
	// in a circle there is no "first", so we change the name
	private Node position;

	// a list is always created in an empty state
	protected CircularLinkedList() {
		position = null;
	}

	// if we need position in classes that extend this one
	protected Node getPosition() {
		return position;
	}

	// simple and self-explained code. Worth to reuse it
	public boolean isEmpty() {
		return (position == null);
	}

	// we insert after position, just because we had
	// to decide where to insert, but no special reason
	public void insert(Object o) {
		Node n = new Node(o, null);
		if (position == null) {
			n.setNext(n);
			position = n;
		} else {
			n.setNext(position.getNext());
			position.setNext(n);
		}
	}

	public Object extract() {
		Object out = null;
		// look carefully which value is returned in each case
		//
		// 1 - if the list is empty, return null
		// 2 - if the list has only one value,
		// return the value and state that the list is empty
		// 3 - if the list has more than one value,
		// return the value that is next to 'position' and
		// the Node that contained the returned Object.
		//
		// Look that in the third case, instead of returning the value of
		// position, it is returned the next in the list. Why? Because it was
		// easier to implement, nothing else. (draw it for a better understanding)
		if (!isEmpty()) {
			position = position.getNext();
			out = position.getInfo();
		}
		return out;
	}

	public String toString() {
		return "";
	}

	public int size() {
		int result = 0;
		Node cur = position;
		if (cur != null) {
			do {
				result++;
				cur = cur.getNext();
			} while (cur != position);
		}
		return result;
	}

	public Object[] toArray() {
		int size = size();
		Object[] result = null;
		if (size > 0) {
			result = new Object[size];
			for (int i = 0; i < size; i++) {
				result[i] = extract();
			}
		}
		return result;
	}
}