/**
 * 
 */
package powern;

import java.util.Scanner;

/**
 * @author Hans
 *
 */
public class PowerCalculator {

	static Scanner inputTal = new Scanner(System.in);

	public static int inputMsg(String msg) {
		System.out.print(msg + ": ");
		return inputTal.nextInt();
	}

	/**
	 * Calculate the non-negative power of an integer number. If a negative power is
	 * input, the method returns 1.
	 * 
	 * @param number The number to take power.
	 * @param power  The power factor to be taken to.
	 * @return The calculation result after taking power of the integer number.
	 */
	public static long powerN(int number, int power) {
		long result = 1;
		int counter = 1;

		if (power > 0)
			while (counter++ <= number)
				result = result * power;

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var number = inputMsg("Number");
		var power = inputMsg("Power");

		var calculatedPower = powerN(number, power);

		System.out.println("Result is: " + calculatedPower);
	}
}