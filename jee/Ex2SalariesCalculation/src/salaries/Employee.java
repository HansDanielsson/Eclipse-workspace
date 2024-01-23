package salaries;

public class Employee implements Taxes {
	private double baseSalary = 40000;
	private int years;

	public Employee(int years) {
		this.years = years;
	}

	public double getBonus() {
		return 1000.0 * years;
	}

	public double getGrossSalary() {
		return baseSalary + getBonus();
	}

	public double getNetSalary() {
		double result = getGrossSalary();
		return result * (1.0 - Taxes.getTaxRate(result));
	}
}