package duplicates;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> computerBrands = new ArrayList<>();

		computerBrands.add("Apple");
		computerBrands.add("Acer");
		computerBrands.add("Samsung");
		computerBrands.add("Asus");
		computerBrands.add("Sony");
		computerBrands.add("Dell");
		computerBrands.add("Hewlett-Packard");
		computerBrands.add("Asus");
		computerBrands.add("Apple");
		computerBrands.add("Acer");
		computerBrands.add("Toshiba");
		computerBrands.add("Sony");
		computerBrands.add("Samsung");

		ArrayList<String> duplList = new ArrayList<>();
		for (String string : computerBrands) {
			if (!duplList.contains(string)) {
				duplList.add(string);
			}
		}
		System.out.println("Listan " + computerBrands);
		System.out.println("Inga dubletter: " + duplList);
	}
}