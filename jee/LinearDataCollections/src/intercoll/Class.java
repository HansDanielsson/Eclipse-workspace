package intercoll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class {

	private static void method1(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void method2(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();

		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");

		method1(myList);
		method2(myList);
	}
}