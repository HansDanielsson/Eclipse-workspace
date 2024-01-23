package intercoll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			myList.add(i, (int) (Math.random() * 10));
		}
		Iterator<Integer> iterator = myList.iterator();
		while (iterator.hasNext()) {
			Integer element = iterator.next();
			if (element < 5) {
				iterator.remove();
			}
		}
		System.out.println(myList);
	}
}