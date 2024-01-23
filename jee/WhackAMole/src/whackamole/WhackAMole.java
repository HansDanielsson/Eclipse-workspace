/**
 * 
 */
package whackamole;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Hans
 *
 */
public class WhackAMole {

	int score;
	int molesLeft;
	int attemptsLeft;
	char[][] moleGrid;

	/**
	 * 
	 * @param numAttempts
	 * @param gridDimension
	 */
	public WhackAMole(int numAttempts, int gridDimension) {
		int posX;
		int posY;
		moleGrid = new char[gridDimension][gridDimension];
		for (posX = 0; posX < gridDimension; posX++)
			for (posY = 0; posY < gridDimension; posY++)
				moleGrid[posX][posY] = '*';
		score = 0;
		attemptsLeft = numAttempts;
		molesLeft = 0;
		Random r = new Random();
		while (molesLeft < gridDimension) {
			posX = r.nextInt(gridDimension);
			posY = r.nextInt(gridDimension);
			if (place(posX, posY))
				molesLeft++;
		}
	}

	/**
	 * Given a location, place a mole at that location. Return true if you can.
	 * (Also update number of moles left.) - In constructor
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean place(int x, int y) {
		boolean result = false;
		if (moleGrid[x][y] == '*') {
			moleGrid[x][y] = 'M';
			result = true;
		}
		return result;
	}

	/**
	 * Given a location, take a whack at that location. If that location contains a
	 * mole, the score, number of attemptsLeft, and molesLeft is updated. If that
	 * location does not contain a mole, only attemptsLeft is updated.
	 * 
	 * @param x
	 * @param y
	 */
	public void whack(int x, int y) {
		if (moleGrid[x][y] == 'M') {
			moleGrid[x][y] = 'W';
			score++;
			molesLeft--;
		} else
			moleGrid[x][y] = '.';
		attemptsLeft--;
	}

	/**
	 * Print the grid without showing where the moles are. For every spot that has
	 * recorded a “whacked mole,” print out a W, or * otherwise.
	 */
	public void printGridToUser() {
		System.out.println("Print the grid");
		for (int x = 0; x < moleGrid.length; x++) {
			System.out.print(x + ":");
			for (int y = 0; y < moleGrid[x].length; y++)
				if ((moleGrid[x][y] == 'W') || (moleGrid[x][y] == '.'))
					System.out.print(moleGrid[x][y]);
				else
					System.out.print('*');
			System.out.println(' ');
		}
		System.out.println(" ");
	}

	/**
	 * Print the grid completely. This is effectively dumping the 2d array on the
	 * screen. The places where the moles are should be printed as an ‘M’. The
	 * places where the moles have been whacked should be printed as a ‘W’. The
	 * places that don’t have a mole should be printed as *.
	 */
	public void printGrid() {
		System.out.println("Print the grid completely.");
		for (int x = 0; x < moleGrid.length; x++) {
			System.out.print(x + ":");
			for (int y = 0; y < moleGrid[x].length; y++)
				System.out.print(moleGrid[x][y]);
			System.out.println(' ');
		}
		System.out.println(" ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WhackAMole gameBoard = new WhackAMole(50, 10);
		System.out.println("Antal försök: " + gameBoard.attemptsLeft);
		try (Scanner scanner = new Scanner(System.in)) {
			int newX;
			int newY;
			boolean newRols = true;
			while (newRols) {
				gameBoard.printGridToUser();
				System.out.println("Ange ner, x:");
				newX = scanner.nextInt();
				System.out.println("Ange in på raden, y:");
				newY = scanner.nextInt();
				if (newX == -1 && newY == -1) {
					gameBoard.printGrid();
					newRols = false;
				} else
					gameBoard.whack(newX, newY);
			}
		}
	}
}