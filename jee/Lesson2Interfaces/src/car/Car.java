package car;

import vehicle.Vehicle;

public class Car implements Vehicle {
	private String transportType = "terrestrial";
	private int wheels;

	public Car(int wheels) {
		this.wheels = wheels;
	}

	public String getTransportType() {
		return transportType;
	}

	public boolean hasWheels() {
		return wheels > 0;
	}

	public int getNumberOfWheels() {
		return wheels;
	}
}