package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class Stats {

	ArrayList<Integer> numbers;

	public Stats() {
		numbers = new ArrayList<>();
	}

	public double average() {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum / (1.0 * numbers.size());
	}

	public double std() {
		double mean = average();
		double deviations = 0;
		for (int i = 0; i < numbers.size(); i++) {
			deviations += (numbers.get(i) - mean) * (numbers.get(i) - mean);
		}
		return Math.sqrt(deviations / numbers.size());
	}

	public static void main(String[] args) {
		Stats stats = new Stats();
		System.out.println("Enter some numbers. Enter a 'q' to quit");
		String input = "";
		try (Scanner scanner = new Scanner(System.in)) {
			while (!input.equals("q")) {
				input = scanner.next();
				if (!input.equals("q")) {
					stats.numbers.add(Integer.parseInt(input));
				}
			}
		}
		System.out.println(stats.average());
		System.out.println(stats.std());
	}
}