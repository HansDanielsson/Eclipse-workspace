/**
 * 
 */
package squareproj;

/**
 * @author Hans
 *
 */
public class Squarelotron {

	int[][] squarelotron;
	int size;

	public Squarelotron(int n) {
		int tal = 1;
		size = n;
		squarelotron = new int[n][n];
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++)
				squarelotron[x][y] = tal++;
		}
	}

	public Squarelotron upsideDownFlip(int ring) {
		var newSquarel = new Squarelotron(size);
		return newSquarel;
	}

	public Squarelotron mainDiagonalFlip(int ring) {
		var newSquarel = new Squarelotron(size);
		return newSquarel;
	}

	public void rotateRight(int numberOfTurns) {

	}

	public void printSquarel() {
		System.out.println("Squarel print:");
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++)
				System.out.print(squarelotron[x][y]);
			System.out.println(" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var sq = new Squarelotron(5);
		sq.printSquarel();
	}
}