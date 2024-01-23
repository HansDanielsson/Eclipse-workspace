package salaries;

public interface Taxes {
	public double getGrossSalary();

	public double getNetSalary();

	public static double getTaxRate(double grossSalary) {
		if (grossSalary < 10000) {
			return 0.05;
		} else if (grossSalary < 20000) {
			return 0.07;
		} else if (grossSalary < 50000) {
			return 0.10;
		} else {
			return 0.15;
		}
	}
}