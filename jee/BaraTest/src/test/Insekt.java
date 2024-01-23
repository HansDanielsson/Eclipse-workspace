package test;

public class Insekt {
	
	private String namn;
	private String color;

	public Insekt(String inNamn, String inColor) {
		namn = inNamn;
		color = inColor;
	}

	public void setNamn(String inNamn) {
		namn = inNamn;
	}

	public String getNamn() {
		return namn;
	}

	public void setColor(String inColor) {
		color = inColor;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "namn: " + namn + " Color: " + color;
	}
}