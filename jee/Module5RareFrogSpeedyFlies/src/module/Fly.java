package module;

public class Fly {
	private double mass;
	private double speed;
	
	public Fly(double mass, double speed) {
		this.mass = mass;
		this.speed = speed;
	}
	
	public Fly(double mass) {
		this(mass, 10.0);
	}
	
	public Fly() {
		this(5.0, 10.0);
	}
	
	public void setMass(double inMass) {
		mass = inMass;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setSpeed(double inSpeed) {
		speed = inSpeed;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void grow(int inMass) {
		mass += inMass;
		if (mass < 20) {
			speed += inMass;
		} else {
			speed -= 0.5*inMass;
		}
	}
	
	public boolean isDead() {
		return (mass == 0);
	}
	
	@Override
	public String toString() {
		return (mass == 0) ? "I'm dead, but I used to be a fly with a speed of " + speed + "." : "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
	}
}