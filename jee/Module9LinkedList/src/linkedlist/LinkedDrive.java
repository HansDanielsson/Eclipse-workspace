package linkedlist;

public class LinkedDrive {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();

		for (int i = 0; i < 15; i++) {
			li.addAtIndex(i, i);
		}
		Node<Integer> start = li.getHead();
		do {
			System.out.print(start.getData() + ", ");
			start = start.getNext();
		} while (start != li.getTail());
		System.out.println(start.getData() + " slut");

		li.removeAtIndex(5);
		start = li.getHead();
		do {
			System.out.print(start.getData() + ", ");
			start = start.getNext();
		} while (start != li.getTail());
		System.out.println(start.getData() + " slut");

		li.remove(10);
		start = li.getHead();
		do {
			System.out.print(start.getData() + ", ");
			start = start.getNext();
		} while (start != li.getTail());
		System.out.println(start.getData() + " slut");
	}
}