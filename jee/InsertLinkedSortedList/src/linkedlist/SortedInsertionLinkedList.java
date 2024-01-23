package linkedlist;

public class SortedInsertionLinkedList {

	public static void main(String[] args) {
		// Create a linked list using MyLinkedList<Integer>
		MyLinkedList<Integer> mine = new MyLinkedList<>();
		// Insert 10 ints
		for (int i = 0; i < 100; i++) {
			mine.insert((int)(100*Math.random()));
		}
		mine.insert(10);
		mine.insert(100);
		mine.insert(0);
		// Print the whole list
		mine.print();
	}
}