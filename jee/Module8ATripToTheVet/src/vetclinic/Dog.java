package vetclinic;

public class Dog extends Pet {
	private double droolRate;

	public Dog(String inName, double inHealth, int inPainLevel, double inDroolRate) {
		super(inName, inHealth, inPainLevel);
		droolRate = inDroolRate;
		if (droolRate <= 0.0) {
			droolRate = 0.5;
		}
	}

	public Dog(String inName, double inHealth, int inPainLevel) {
		this(inName, inHealth, inPainLevel, 5.0);
	}

	public double getDroolRate() {
		return droolRate;
	}

	public int treat() {
		int result;
		if (getDroolRate() < 3.5) {
			result = (int) (0.9 + ((getPainLevel() * 2.0) / getHealth()));
		} else if (getDroolRate() > 7.5) {
			result = (int) (0.9 + (getPainLevel() / (getHealth() * 2.0)));
		} else {
			result = (int) (0.9 + (getPainLevel() / getHealth()));
		}
		heal();
		return result;
	}

	@Override
	public void speak() {
		super.speak();
		String msg = "bark ";
		int timesPaint = getPainLevel();
		if (timesPaint > 5) {
			msg = msg.toUpperCase();
		}
		for (int i = 0; i < timesPaint; i++) {
			System.out.print(msg);
		}
		System.out.println(" ");
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Dog) {
			Dog inDog = (Dog) o;
			result = super.equals(inDog) && droolRate == inDog.droolRate;
		}
		return result;
	}
}