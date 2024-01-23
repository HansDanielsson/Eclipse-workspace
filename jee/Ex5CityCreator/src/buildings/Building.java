package buildings;

import persons.Person;

public class Building {
	protected Person person;
	protected String color;

	public Building(Person person, String color) {
		this.person = person;
		this.color = color;
		this.person.incBuilding();
	}
	
	@Override
	public String toString() {
		return "Person: " + person + " color: " + color;
	}
}