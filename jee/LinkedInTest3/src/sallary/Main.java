package sallary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Input 1 : Number of hours the employee works per week.
		// Input 2: Amount of money the employee makes per hour.
		// Output: Employee's gross yearly salary
		try (var scanner = new Scanner(System.in)) {
			System.out.print("Number of hours the employee works per week :");
			var employeWorksPerWeek = scanner.nextDouble();

			System.out.print("Amount of money the employee makes per hour :");
			var employeeMakesPerHour = scanner.nextDouble();

			System.out.print("Numbers of holidays weeks :");
			var employeeHolidaysWeeks = scanner.nextInt();

			var grossYearlySalary = calculateGrossSalary(employeWorksPerWeek, employeeMakesPerHour,
					employeeHolidaysWeeks);
			System.out.println("Employee yearly salary :" + grossYearlySalary);
		}
	}

	private static double calculateGrossSalary(double employeWorksPerWeek, double employeeMakesPerHour, int holidays) {
		return employeWorksPerWeek * employeeMakesPerHour * (52 - holidays);
	}
}