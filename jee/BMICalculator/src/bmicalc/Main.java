package bmicalc;

public class Main {

	public static void main(String[] args) {
		double mass = 91;
		double height = 1.79;
		double bmi = mass / (height * height);

		String category;

		if (bmi < 18.5) {
			category = "Undervikt";
		} else if (bmi < 25) {
			category = "Normalvikt";
		} else if (bmi < 30) {
			category = "Övervikt";
		} else {
			category = "Fetma";
		}
		System.out.println("Din bmi nr = " + bmi + " Din bmi " + category);
	}
}