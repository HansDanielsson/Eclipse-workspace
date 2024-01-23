package module;

public class Frog {
	private String name;
	private int age; // Number of months
	private double tongueSpeed;
	private boolean isFroglet;

	public Frog(String inName, int inAge, double inTongueSpeed) {
		name = inName;
		age = inAge;
		isFroglet = ageFroglet();
		tongueSpeed = inTongueSpeed;
	}

	public Frog(String inName, double inAgeInYears, double inTongueSpeed) {
		this(inName, (int) (12 * inAgeInYears), inTongueSpeed);
	}

	public Frog(String inName) {
		this(inName, 5, 5);
	}

	private boolean ageFroglet() {
		return (age > 1) && (age < 7);
	}

	public void grow(int inAge) {
		age += inAge;
		isFroglet = ageFroglet();
		if (age < 13) {
			tongueSpeed += inAge;
		} else if (age >= 30) {
			tongueSpeed -= (age - 30);
		}
		if (tongueSpeed < 5) {
			tongueSpeed = 5;
		}
	}

	public void grow() {
		this.grow(1);
	}

	public void eat(Fly inFly) {
		if (!inFly.isDead()) {
			if (tongueSpeed > inFly.getSpeed()) {
				if (inFly.getMass() > 0.5 * age) {
					grow();
				}
				inFly.setMass(0);
			} else {
				inFly.setMass(inFly.getMass() + 1);
			}
		}
	}

	@Override
	public String toString() {
		String msg = "My name is " + name + " and I'm a rare ";
		msg += (isFroglet) ? "froglet!" : "frog.";
		msg += " I'm " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
		return msg;
	}
}