package battle;

import java.util.Scanner;

public class Battleship {

	static Scanner input = new Scanner(System.in);

	private static int[] enterColumn(String msg) {
		String[] inStr;
		int[] result = { 0, 1 };
		boolean inLoop = true;

		while (inLoop) {
			System.out.println(msg);
			try {
				inStr = input.nextLine().split(" ");
				result[0] = Integer.parseInt(inStr[0]);
				result[1] = Integer.parseInt(inStr[1]);
				if ((result[0] >= 0) && (result[0] < 5) && (result[1] >= 0) && (result[1] < 5)) {
					inLoop = false;
				} else {
					System.out.println("Invalid coordinates. Choose different coordinates.");
				}
			} catch (Exception e) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			}
		}
		return result;
	}

	private static char[][] inputBoard(String msg) {
		int counter = 1;
		int[] cord;
		char[][] player = new char[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				player[i][j] = '-';
			}
		}
		System.out.println(msg);
		while (counter < 6) {
			cord = enterColumn("Enter ship " + counter + " location:");
			if (player[cord[0]][cord[1]] == '-') {
				player[cord[0]][cord[1]] = '@';
				counter++;
			} else {
				System.out.println("You already have a ship there. Choose different coordinates.");
			}
		}
		return player;
	}

	private static void printBattleShip(boolean hidden, char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					if (hidden && player[row][column] == '@') {
						System.out.print("- ");
					} else {
						System.out.print(player[row][column] + " ");
					}
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int numShip;
		int[] cord;
		char[][][] player = new char[2][][];
		int playMore = 0;
		System.out.println("Welcome to Battleship!");
		for (int i = 0; i < 2; i++) {
			player[i] = inputBoard("PLAYER " + (i + 1) + ", ENTER YOUR SHIPS COORDINATES.");
			printBattleShip(false, player[i]);
		}
		do {
			cord = enterColumn("Player " + (playMore + 1) + ", enter hit row/column");
			if (player[1 - playMore][cord[0]][cord[1]] == '-') {
				player[1 - playMore][cord[0]][cord[1]] = 'O';
				System.out.println("PLAYER " + (playMore + 1) + " MISSED!");
				playMore = 1 - playMore;
			} else if (player[1 - playMore][cord[0]][cord[1]] == '@') {
				player[1 - playMore][cord[0]][cord[1]] = 'X';
				System.out.println("PLAYER " + (playMore + 1) + " HIT PLAYER " + (2 - playMore) + "'s SHIP!");
				playMore = 1 - playMore;
			} else {
				System.out.println("You already fired on this spot. Choose different coordinates.");
			}
			printBattleShip(true, player[playMore]);
			numShip = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (player[playMore][i][j] == '@') {
						numShip++;
					}
				}
			}
			if (numShip == 0) {
				System.out.println("PLAYER " + playMore + " WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
				playMore = -10;
			}
		} while (playMore > -1);
		System.out.println("Final boards:");
		printBattleShip(false, player[0]);
		System.out.println(" ");
		printBattleShip(false, player[1]);
	}
}