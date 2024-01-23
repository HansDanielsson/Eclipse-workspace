/**
 * 
 */
package integermulti;

import java.util.Scanner;

/**
 * @author Hans
 *
 */
public class IntegerMulti {

	static Scanner scanner = new Scanner(System.in);

	public static int printMsg(String msg) {
		System.out.print(msg + ": ");
		return scanner.nextInt();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var xValue = printMsg("Enter an integer, x");
		var yValue = printMsg("Enter an integer, y");

		var xyValue = xValue * yValue;
		System.out.println("Answer = " + xyValue);
	}
}