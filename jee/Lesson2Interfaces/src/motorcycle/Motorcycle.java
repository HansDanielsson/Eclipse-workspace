package motorcycle;

import vehicle.Vehicle;

public class Motorcycle implements Vehicle {
	private String transportType = "SuperBike";
	private int wheels;

	public Motorcycle() {
		this.wheels = 2;
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