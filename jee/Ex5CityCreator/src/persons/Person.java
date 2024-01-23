package persons;

public class Person {
	private String name;
	private int amountOfBuildings;

	public Person(String name) {
		this.name = name;
		amountOfBuildings = 0;
	}

	public void incBuilding() {
		amountOfBuildings++;
	}

	@Override
	public String toString() {
		return name + " hus: " + amountOfBuildings;
	}
}