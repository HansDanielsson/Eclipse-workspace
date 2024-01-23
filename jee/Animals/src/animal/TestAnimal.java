package animal;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(3);
		animal.speak();
		Lion lion1 = new Lion();
		lion1.speak();
		Lion lion2 = new Lion("Garfield");
		lion2.speak();
		Lion lion3 = new Lion(99);
		lion3.speak();
		Lion lion4 = new Lion("Simba", 100);
		lion4.speak();
	}
}
