package stack;

public class PrintStack {

	/** Recursive algorithm to print a Stack */
	private static void print(LinkedStack<Integer> p) {
		if ((p != null) && (!p.isEmpty())) {
			int item = p.pop();
			System.out.println(item);
			print(p);
			p.push(item);
		}
	}

	public static void main(String[] args) {
		LinkedStack<Integer> p = new LinkedStack<>();

		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);

		System.out.println("Stacks elements:");
		print(p);
	}
}