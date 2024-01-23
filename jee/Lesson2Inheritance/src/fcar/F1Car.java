package fcar;

import car.Car;

public class F1Car extends Car {
	public F1Car(int topSpeed) {
		super(topSpeed);
	}

	@Override
	public void printDescription() {
		System.out.println("F1 Car with top speed " + this.getTopSpeed());
	}
}