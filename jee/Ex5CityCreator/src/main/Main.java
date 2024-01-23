package main;

import buildings.Building;
import buildings.FarmHouse;
import buildings.OldHouse;
import persons.Person;

public class Main {

	public static void main(String[] args) {
		Person kalle = new Person("Kalle");
		Building hus = new Building(kalle, "Gul");
		
		System.out.println(kalle);
		System.out.println(hus);
		Building gammalHus = new OldHouse(kalle, "Brun", 1980);
		System.out.println(gammalHus);
		FarmHouse farm = new FarmHouse(kalle, "Svart", 100);
		System.out.println(farm);
		farm.paint("vit");
		System.out.println(farm);
	}
}