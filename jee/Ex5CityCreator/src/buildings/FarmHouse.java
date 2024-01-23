package buildings;

import persons.Person;

public class FarmHouse extends Building implements Paintable{
private int sizeOfGarden;
	
public FarmHouse(Person person, String color, int sizeOfGarden) {
		super(person, color);
		this.sizeOfGarden = sizeOfGarden;
	}
	
	public void paint(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + " Garden: " + sizeOfGarden;
	}
}