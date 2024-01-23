package test;

public abstract class Figure {
	private String name;

	protected Figure(String n) {
		name = n;
	}

	@Override
	public String toString() {
		return name;
	}

	public abstract double calculateArea();

	public abstract double calculatePerimeter();
}