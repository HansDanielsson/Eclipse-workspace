package car;

public class Car {
	private int topSpeed;

	public Car(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void printDescription() {
		System.out.println("Car with top speed " + topSpeed);
	}
}