package linkedlist;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// Create a linked list using MyLinkedList<Integer>
		MyDoublyLinkedList<Integer> mine = new MyDoublyLinkedList<>();

		System.out.println("Inserting at beginning");
		// Insert the first 10 ints at the beginning
		for (int i = 0; i < 10; i++) {
			mine.insert(i);
		}
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		System.out.println("Extracting from beginning");
		// Extract all the elements from the list from the beginning
		Integer bar;
		while ((bar = mine.extract()) != null) {
			System.out.print(bar + " ");
		}
		System.out.println();

		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		System.out.println("Inserting at the end");
		// Insert 10 ints at the end
		for (int i = 0; i < 10; i++) {
			mine.insertEnd(i);
		}

		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		System.out.println("Extracting from the end");

		// Extract all the elements from the list from the beginning

		while ((bar = mine.extractEnd()) != null) {
			System.out.print(bar + " ");
		}

		System.out.println();

		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		System.out.println("Inserting at beginning");
		// Insert the first 10 ints at the beginning
		for (int i = 0; i < 3; i++) {
			mine.insert(0);
			mine.insert(1);
			mine.insert(2);
		}

		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		int deleted;
		int value;

		value = 0;
		deleted = mine.deleteAll(value);

		System.out.println("Deleted " + deleted + " nodes with info = " + value);
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		value = 0;
		deleted = mine.deleteAll(value);

		System.out.println("Deleted " + deleted + " nodes with info = " + value);
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		value = 1;
		deleted = mine.deleteAll(value);

		System.out.println("Deleted " + deleted + " nodes with info = " + value);
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		value = 2;
		deleted = mine.deleteAll(value);

		System.out.println("Deleted " + deleted + " nodes with info = " + value);
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();

		value = 2;
		deleted = mine.deleteAll(value);

		System.out.println("Deleted " + deleted + " nodes with info = " + value);
		// Print the whole list forward
		System.out.print("Forwards:  ");
		mine.print();
		// Print the whole list backwards
		System.out.print("Backwards: ");
		mine.printBackwards();
	}
}