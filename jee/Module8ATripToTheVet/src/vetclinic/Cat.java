package vetclinic;

public class Cat extends Pet {
	private int miceCaught;

	public Cat(String inName, double inHealth, int inPainLevel, int inMiceCaught) {
		super(inName, inHealth, inPainLevel);
		miceCaught = inMiceCaught;
		if (miceCaught < 0) {
			miceCaught = 0;
		}
	}

	public Cat(String inName, double inHealth, int inPainLevel) {
		super(inName, inHealth, inPainLevel);
		miceCaught = 0;
	}

	public int getMiceCaught() {
		return miceCaught;
	}

	public int treat() {
		int result = getMiceCaught();
		if (result < 4) {
			result = (int) (0.9 + ((getPainLevel() * 2.0) / getHealth()));
		} else if (result > 7) {
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
		String msg = "meow ";
		int timesPaint = getMiceCaught();
		if (getPainLevel() > 5) {
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
		if (o instanceof Cat) {
			Cat inCat = (Cat) o;
			result = super.equals(inCat) && miceCaught == inCat.miceCaught;
		}
		return result;
	}
}