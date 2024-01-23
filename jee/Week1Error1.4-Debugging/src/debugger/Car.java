package debugger;

public class Car {
	private String brand;
	private int hp;

	public Car(String brand, int hp) {
		this.brand = brand;
		this.hp = hp;
	}

	public String getBrand() {
		return brand;
	}

	public int getHP() {
		return hp;
	}
}