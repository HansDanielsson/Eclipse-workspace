package words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		String word = "";
		// Ask the user for 10 words
		System.out.println("Input 10 words:");
		for (int i = 0; i < 10; i++) {
			word = input.next();
			if (!words.contains(word)) {
				words.add(word);
			}
		}

		// Print the list and it size
		System.out.println("Listan: ");
		System.out.println(words);
		System.out.println("Size list: " + words.size());
		// Hint:
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#size--

		// Ask the user for 1 letter
		System.out.println("Input 1 letter: ");
		word = input.next();

		// Remove from list all the words that start with that letter
		// Hint:
		// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#remove-java.lang.Object-
		Iterator<String> itr = words.iterator();
		while (itr.hasNext()) {
			if (itr.next().charAt(0) == word.charAt(0)) {
				itr.remove();
			}
		}

		// Print the List again and it size
		System.out.println("List removed :" + words);
		System.out.println("List size: " + words.size());
		input.close();
	}
}