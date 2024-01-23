package citycar;

import car.Car;

public class CityCar extends Car {
	private int seatingCapacity;

	public CityCar(int topSpeed, int seating) {
		super(topSpeed);
		this.seatingCapacity = seating;
	}

	@Override
	public void printDescription() {
		System.out.println("City Car with " + seatingCapacity + " seats places and topspeed " + this.getTopSpeed());
	}
}