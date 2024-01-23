package product;

import java.text.DecimalFormat;

public class Product {
	public int id;
	public String name;
	public String department;
	public float price;

	public Product(int id, String name, String department, float price) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.price = price;
	}

	@Override
	public String toString() {
		return (name + (new DecimalFormat(" $0.00")).format(price));
	}
}