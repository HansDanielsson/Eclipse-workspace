package storex;

public class Product {
	public int id;
	public int stock;
	public String name;
	public String category;
	public float price;

	public Product(int id, String name, String category, float price, int stock) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return name;
	}
}