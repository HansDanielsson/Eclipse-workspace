package product;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Product> store = new LinkedList<>(Arrays.asList(
				// ID Name Department Price
				new Product(0, "Laptop", "Electronics", 1099.99f),
				new Product(1, "Hat", "Clothes", 5f),
				new Product(2, "Stove", "Kitchen", 800.70f),
				new Product(3, "Camara", "Electronics", 50.50f),
				new Product(4, "Fridge", "Kitchen", 960.25f),
				new Product(5, "Sweater", "Clothes", 25f),
				new Product(6, "Scanner", "Electronics", 346.60f),
				new Product(7, "Microwave", "Kitchen", 490.10f),
				new Product(8, "Pants", "Clothes", 10.30f)));

		// Print each of the products
		System.out.println("Original List:");
		System.out.println(store);

		// Filter and print the Products which belongs to the Electronics department
		System.out.println("Only Electronics:");
		System.out.println(store.stream().filter(product -> product.department.equals("Electronics"))
				.collect(Collectors.toList()));

		// Remove Products which belongs to the Kitchen department
		store.removeIf(p -> p.department.equals("Kitchen"));

		// Print each of the products
		System.out.println("\n\nWithout Kitchen department, list:");
		System.out.println(store);

		// Print products that are chepear than $800.00
		System.out.println("\n\nCheap products:");
		System.out.println(store.stream().filter(product -> product.price < 800).collect(Collectors.toList()));

		// Remove Products that more expensive than $700.00
		store.removeIf(p -> p.price > 700);

		// Print each of the products
		System.out.println("\n\nWithout Expensive products, list:");

		System.out.println(store);
	}
}