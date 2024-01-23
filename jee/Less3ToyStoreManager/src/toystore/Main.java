package toystore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] toys = new String[9];
		toys[0] = "Buzz Lightyear";
		toys[1] = "Sheriff Woody";
		toys[2] = "Mr. Potato Head";
		toys[3] = "Barbie";
		toys[4] = "Troll doll";
		toys[5] = "Tonka Truck";
		toys[6] = "Elmo";
		toys[7] = "Big bird";
		toys[8] = "Cookie Monster";

		// Make a list of lists or hashmap to classify the toys.
		List<String> toList = new ArrayList<>();
		Collections.addAll(toList, toys);
		// Then sort the list of lists or hashmap ascendingly
		Collections.sort(toList);
		// Print each value
		System.out.println("Sort list: " + toList);
	}
}