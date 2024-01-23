package linkedlist;

import java.util.Iterator;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Node<Integer> current = new Node<>(5,null);
		current = new Node<>(10,current);
		current = new Node<>(20,current);
		linkedList.head = new Node<>(10,current);
		
		Iterator<Integer> llIterator = linkedList.iterator();
		while (llIterator.hasNext()) {
			Integer data = llIterator.next();
			System.out.println("Data: " + data);
		}
		
		for (Integer data : linkedList) {
			System.out.println("Data: " + data);
		}
	}
}