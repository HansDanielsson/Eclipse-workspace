/**
 * 
 */
package counter;

/**
 * @author Hans
 *
 */
public class Counter {

	int countX;

	Counter() {
		countX = 0;
	}

	public int increment() {
		countX++;
		return countX;
	}

	public int decrement() {
		countX--;
		return countX;
	}

	public int getCounter() {
		return countX;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Counter c = new Counter();
		System.out.println(c.countX);
	}

}
