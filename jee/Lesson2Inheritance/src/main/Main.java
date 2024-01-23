package main;

import car.Car;
import citycar.CityCar;
import fcar.F1Car;

public class Main {

	public static void main(String[] args) {
		Car ferrari = new F1Car(320);
		Car coupe = new Car(220);
		Car sedan = new CityCar(100, 5);

		ferrari.printDescription();
		coupe.printDescription();
		sedan.printDescription();
	}
}