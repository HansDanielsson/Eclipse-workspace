package queue;

public class DQStack implements Stack {
	private Dqueue data;

	public DQStack() {
		data = new DLDqueue();
	}

	public void push(Object obj) {
		data.insertLast(obj);
	}

	public Object pop() {
		return data.removeLast();
	}

	public int size() {
		return data.size();
	}

	public String toString() {
		return data.toString();
	}

	public static void main(String[] args) {

		DQStack stack = new DQStack();
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
		System.out.println("Printing stack: " + stack);

		int s = stack.size();
		System.out.println("Printing size: " + s);

		Object o = stack.pop();
		System.out.println("Pop element = " + o);

		System.out.println("Printing stack: " + stack);

	}
}