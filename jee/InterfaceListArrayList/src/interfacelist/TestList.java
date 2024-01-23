package interfacelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestList {

	private static void printList(List<Integer> mine) {
		for (Integer s : mine)
			System.out.print(s + " ");
		System.out.println();
	}

	private static List<Integer> createRandomList(int size, int max) {
		List<Integer> result = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			result.add(rand.nextInt(max));
		}
		return result;
	}

	/*
	 * You should implement this function without resorting to use HashSet and
	 * maintaining the order of the List
	 */
	private static void removeDuplicates(List<Integer> mine) {
		for (int i = 0; i < mine.size(); i++) {
			int item = mine.get(i);
			while (mine.indexOf(item) != mine.lastIndexOf(item)) {
				mine.remove(mine.lastIndexOf(item));
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> myList = createRandomList(10, 5);
		printList(myList);
		// remove Duplicates from myList
		removeDuplicates(myList);
		printList(myList);
	}
}