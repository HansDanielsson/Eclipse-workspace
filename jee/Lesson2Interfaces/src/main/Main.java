/**
 * 
 */
package main;

import car.Car;
import motorcycle.Motorcycle;

/**
 * @author Hans
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car taxi = new Car(4);
		System.out.println("Taxi has wheels? " + taxi.hasWheels() + " Number of wheels: " + taxi.getNumberOfWheels());

		Motorcycle bike = new Motorcycle();
		System.out.println("Bike has wheels? " + bike.hasWheels() + " Number of wheels: " + bike.getNumberOfWheels());
	}
}