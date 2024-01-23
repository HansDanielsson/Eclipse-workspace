package calcus;

import java.util.Scanner;

public class Calculator {

	static Scanner input = new Scanner(System.in);
	static String inString;

	public static int[] input2int() {
		System.out.println("Enter two integers:");
		inString = input.nextLine();
		String[] token = inString.split(" ");
		int[] result = { 0, 1 };
		try {
			result[0] = Integer.parseInt(token[0]);
			result[1] = Integer.parseInt(token[1]);
		} catch (Exception e) {
			System.out.println("Invalid input entered. Terminating...");
			return null;
		}
		return result;
	}

	public static double[] input2dou() {
		System.out.println("Enter two doubles:");
		inString = input.nextLine();
		String[] token = inString.split(" ");
		double[] result = { 0D, 1D };
		try {
			result[0] = Double.parseDouble(token[0]);
			result[1] = Double.parseDouble(token[1]);
		} catch (Exception e) {
			System.out.println("Invalid input entered. Terminating...");
			return null;
		}
		return result;
	}

	public static String[] input2str() {
		System.out.println("Enter two words:");
		return input.nextLine().split(" ");
	}

	public static void main(String[] args) {
		final String[] comands = { "add", "subtract", "multiply", "divide", "alphabetize" };
		int[] intTal;
		double[] douTal;
		String[] strTal;
		boolean runCalcus = true;
		while (runCalcus) {
			System.out.print("List of operations: ");
			for (String string : comands) {
				System.out.print(string + " ");
			}
			System.out.println(" ");
			System.out.println("Enter an operation:");
			inString = input.nextLine().toLowerCase();
			if (comands[0].equals(inString)) {
				intTal = input2int();
				if (intTal == null) {
					runCalcus = false;
				} else {
					System.out.println("Answer: " + (intTal[0] + intTal[1]));
				}
			} else if (comands[1].equals(inString)) {
				intTal = input2int();
				if (intTal == null) {
					runCalcus = false;
				} else {
					System.out.println("Answer: " + (intTal[0] - intTal[1]));
				}
			} else if (comands[2].equals(inString)) {
				douTal = input2dou();
				if (douTal == null) {
					runCalcus = false;
				} else {
					System.out.println("Answer: " + (douTal[0] * douTal[1]));
				}
			} else if (comands[3].equals(inString)) {
				douTal = input2dou();
				if (douTal == null) {
					runCalcus = false;
				} else if (douTal[1] == 0) {
					System.out.println("Dividing with 0 not allowed!");
				} else {
					System.out.println("Answer: " + (douTal[0] / douTal[1]));
				}
			} else if (comands[4].equals(inString)) {
				strTal = input2str();
				if (strTal[0].compareToIgnoreCase(strTal[1]) == 0) {
					System.out.println("Chicken or Egg");
				} else if (strTal[0].compareToIgnoreCase(strTal[1]) < 0) {
					System.out.println(strTal[0] + " comes before " + strTal[1] + " alphabetically.");
				} else {
					System.out.println(strTal[1] + " comes before " + strTal[0] + " alphabetically.");
				}
			} else {
				System.out.println("Invalid input entered. Terminating...");
				runCalcus = false;
			}
		}
		input.close();
	}
}