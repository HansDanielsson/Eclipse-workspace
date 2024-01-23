package storex;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalInterfaces {
	List<Product> technologystore = new ArrayList<>();

	// Read from file products.txt the list of products
	// Format: Name Categorie Stock Price
	public void readProductsFile() {
		String data;
		String filePath = "src/storex/products.txt";
		File src = new File(filePath);
		Scanner input = null;
		try {
			input = new Scanner(src);
			while (input.hasNext()) {
				data = input.nextLine();
				String[] token = data.split(" ");
				Product pr = new Product(technologystore.size(), token[0], token[1], Float.parseFloat(token[3]),
						Integer.parseInt(token[2]));
				technologystore.add(pr);
			}
		} catch (Exception e) {
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	// Print each of the products
	public void printProducts() {
		technologystore.forEach(pr -> System.out.print(pr + " "));
		System.out.println(" ");
		System.out.println();
	}

	// Filter and print from the list all the products that are Accessories
	public void filter2() {
		technologystore.stream().filter(pr -> pr.category.equals("Accessories"))
				.forEach(pr -> System.out.print(pr + " "));
		System.out.println(" ");

	}

	// Filter and print from the list all the products that the stock is more or
	// equal to 50
	public void filter3() {
		technologystore.stream().filter(pr -> pr.stock >= 50).forEach(pr -> System.out.print(pr + " "));
		System.out.println(" ");
	}

	// Filter and print from the list all the products that: are cheaper than
	// $150.00 and has more than 25 in stock
	public void filter4() {
		technologystore.stream().filter(pr -> pr.price < 150 && pr.stock > 25)
				.forEach(pr -> System.out.print(pr + " "));
		System.out.println(" ");
	}

	public void filter5() {
		// Remove from the list (don't print) if product: the categorie is Office
		// Your Code here
		technologystore.removeIf(pr -> pr.category.equals("Office"));

		// Remove from the list (don't print) if product: has greater than 30 in stock
		// Your Code here
		technologystore.removeIf(pr -> pr.stock > 30);

		// Remove from the list (don't print) if product: are cheaper than $250.00
		// Your Code here
		technologystore.removeIf(pr -> pr.price < 250);

		// Print each of the products that left
		// Your Code here
		technologystore.forEach(pr -> System.out.print(pr + " "));
		System.out.println(" ");
	}

	public static void main(String[] args) {
		FunctionalInterfaces activity4 = new FunctionalInterfaces();
		activity4.readProductsFile();
		System.out.println("----------Filter 1---------");
		activity4.printProducts();
		System.out.println("----------Filter 2---------");
		activity4.filter2();
		System.out.println("----------Filter 3---------");
		activity4.filter3();
		System.out.println("----------Filter 4---------");
		activity4.filter4();
		System.out.println("----------Filter 5---------");
		activity4.filter5();

		/*
		 * ANSWER
		 * 
		 * ----------Filter 1--------- Laptop-12GB_RAM-HDD_1T Printer Headphones
		 * HDMI-VGA-Adapter Laptop-16GB_RAM-SSD_750GB Scanner Computer-Keyboard AUX_5ft
		 * Ink-Cartridge Mouse-Wireless Laptop-8GB_RAM-HDD_500GB USB-microUSB
		 * ----------Filter 2--------- Headphones Computer-Keyboard Mouse-Wireless
		 * ----------Filter 3--------- Printer Headphones AUX_5ft Ink-Cartridge
		 * Mouse-Wireless USB-microUSB ----------Filter 4--------- Headphones
		 * Computer-Keyboard AUX_5ft Ink-Cartridge Mouse-Wireless USB-microUSB
		 * ----------Filter 5--------- Laptop-12GB_RAM-HDD_1T Laptop-16GB_RAM-SSD_750GB
		 * Laptop-8GB_RAM-HDD_500GB
		 */
	}
}