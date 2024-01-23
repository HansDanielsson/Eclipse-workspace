package linkedlist;

import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtil {

	public static void insertSorted(LinkedList<Integer> list, int value) {
		if (list != null) {
			int index = 0;
			int maxListPos = list.size();
			boolean okLoop = true;
			while (okLoop)
				if (index < maxListPos) {
					if ((list.get(index) < value)) {
						index++;
					} else {
						okLoop = false;
					}
				} else
					okLoop = false;
			list.add(index, value);
		}
	}

	public static void removeMaximumValues(LinkedList<String> list, int inN) {
		String value;
		if (list != null)
			for (int i = 0; i < inN; i++) {
				value = "";
				for (String listVal1 : list)
					if (listVal1.compareTo(value) > 0)
						value = listVal1;
				for (int j = 0; j < list.size(); j++)
					if (list.get(j).compareTo(value) == 0) {
						list.remove(j);
						j--;
					}
			}
	}

	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
		boolean okSequence = false;
		if ((one != null) && (two != null) && (!one.isEmpty()) && (!two.isEmpty())) {
			int j;
			for (int i = 0; i <= one.size() - two.size(); i++) {
				j = 0;
				while ((j < two.size()) && (one.get(i + j).equals(two.get(j))))
					j++;
				if (j == two.size())
					okSequence = true;
			}
		}
		return okSequence;
	}
}