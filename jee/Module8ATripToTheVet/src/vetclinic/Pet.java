package vetclinic;

public abstract class Pet {
	private String name;
	private double health;
	private int painLevel;

	public Pet(String inName, double inHealth, int inPainLevel) {
		name = inName;
		health = inHealth;
		if (health > 1.0) {
			health = 1.0;
		} else if (health < 0.0) {
			health = 0.0;
		}
		painLevel = inPainLevel;
		if (painLevel > 10) {
			painLevel = 10;
		} else if (painLevel < 1) {
			painLevel = 1;
		}
	}

	public String getName() {
		return name;
	}

	public double getHealth() {
		return health;
	}

	public int getPainLevel() {
		return painLevel;
	}

	public abstract int treat();

	public void speak() {
		String msg = "Hello! My name is " + name;
		if (getPainLevel() > 5) {
			msg = msg.toUpperCase();
		}
		System.out.println(msg);
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Pet) {
			Pet inPet = (Pet) o;
			result = (name.equals(inPet.name));
		}
		return result;
	}

	protected void heal() {
		health = 1.0;
		painLevel = 1;
	}
}