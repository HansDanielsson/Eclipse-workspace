package animal;

public class Animal {
	private String name;
	private int power;
	
	Animal() {
        this.name = "DEFAULT_NAME";
        this.power = 10;
    }
	
	Animal(String name, int power) {
        this.name = name;
        this.power = power;
    }
	
	Animal(String name) {
        this();
        this.name = name;
    }
	
	Animal(int power) {
        this();
        this.power = power;
    }
	
    void speak() {
        System.out.println("This is " + name + ", my power is " + power);
    }
}