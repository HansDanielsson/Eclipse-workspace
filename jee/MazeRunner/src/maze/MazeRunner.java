package maze;

import java.util.Scanner;

public class MazeRunner {

	static Maze myMap = new Maze();
	private static Scanner useDelimiter = new Scanner(System.in).useDelimiter("\\A");

	public static void intro() {
		System.out.println("Welcome to Maze Runner!");
		System.out.println("Here is your current position:");
	}

	private static String inputChar(String msg) {
		System.out.print(msg);
		return useDelimiter.nextLine();
	}

	public static String userMove() {
		String dir = "";
		boolean inputOk = true;
		while (inputOk) {
			dir = inputChar("Where would you like to move? (R, L, U, D) ");
			inputOk = !dir.equals("R") && !dir.equals("L") && !dir.equals("U") && !dir.equals("D");
		}
		return dir;
	}

	public static void moveMessage(int moves) {
		if (moves == 50)
			System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes.");
		else if (moves == 75)
			System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
		else if (moves == 90)
			System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!");
		else if (moves == 100)
			System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
	}

	public static boolean navigatePit(String dir) {
		boolean result = true;
		if ((myMap.isThereAPit(dir)) && (inputChar("Watch out! There's a pit ahead, jump it? ").charAt(0) == 'y')) {
				myMap.jumpOverPit(dir);
				result = false;
			}
		return result;
	}

	public static void main(String[] args) {
		boolean playAgain = true;
		boolean hitTheWall = false;
		int counterMove = 0;
		String dir;
		intro();
		while (playAgain) {
			myMap.printMap();
			moveMessage(counterMove);
			counterMove++;
			dir = userMove();
			hitTheWall = false;
			if (navigatePit(dir)) {
				if (dir.equals("R")) {
					if (myMap.canIMoveRight()) {
						myMap.moveRight();
					} else {
						hitTheWall = true;
					}
				} else if (dir.equals("L")) {
					if (myMap.canIMoveLeft()) {
						myMap.moveLeft();
					}
					else {
						hitTheWall = true;
					}
				} else if (dir.equals("U")) {
					if (myMap.canIMoveUp()) {
						myMap.moveUp();
					}
					else {
						hitTheWall = true;
					}
				} else if (myMap.canIMoveDown()) {
					myMap.moveDown();
				}
				else {
					hitTheWall = true;
				}
			}
			if (hitTheWall) {
				System.out.println("Sorry you've hit a wall");
			}
			if (counterMove > 100)
				playAgain = false;
			else
				playAgain = !myMap.didIWin();
		}
		if (counterMove > 100) {
			System.out.println("Sorry, but you didn't escape in time- you lose!");
		} else {
			System.out.println("Congratulations, you made it out alive");
			System.out.println("and you did it in " + counterMove + " moves");
		}
	}
}