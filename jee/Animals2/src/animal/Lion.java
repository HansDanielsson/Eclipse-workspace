package animal;

public class Lion extends Animal {

	public Lion() {
		super();
	}
	
	Lion(String name) {
		super(name);
	}
	
	Lion(int power) {
        super(power);
    }
	
	Lion(String name, int power) {
        super(name, power);
    }
	
	@Override
	void speak() {
		System.out.println("Here comes the king!!!");
        super.speak();
	}
}