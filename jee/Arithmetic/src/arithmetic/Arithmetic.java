/**
 *
 */
package arithmetic;

/**
 * @author Hans
 *
 */
public class Arithmetic {
	
	private Arithmetic() {
		throw new IllegalStateException("Utility class");
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static boolean isPositive(int x) {
		return x > 0;
	}
}
