package quadratic;

import java.util.Scanner;

public class QuadraticEquation {

	static Scanner input = new Scanner(System.in);

	public static double printMsg(String msg) {
		System.out.print(msg + ": ");
		return input.nextDouble();
	}

	public static void solveQuadraticEquation() {
		try {
			var avalue = 2.0 * printMsg("Enter a");
			var bvalue = printMsg("Enter b");
			var cvalue = printMsg("Enter c");
			var sq = bvalue * bvalue - 2 * avalue * cvalue;
			if ((sq >= 0) && (avalue != 0)) {
				var sqr = Math.sqrt(sq);
				var firstx = (-bvalue + sqr) / avalue;
				var secondx = (-bvalue - sqr) / avalue;
				System.out.println("First solution for x = " + firstx);
				System.out.println("Second solution for x = " + secondx);
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		solveQuadraticEquation();
	}
}