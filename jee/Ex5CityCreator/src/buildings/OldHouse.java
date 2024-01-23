package buildings;

import persons.Person;

public class OldHouse extends Building {
	private int buildYear;

	public OldHouse(Person person, String color, int buildYear) {
		super(person, color);
		this.buildYear = buildYear;
	}

	@Override
	public String toString() {
		return super.toString() + " Build: " + buildYear;
	}
}