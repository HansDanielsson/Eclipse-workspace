package question;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String input;
		String question = "Vad är det för dag idag?";
		String choiceOne = "";
		String choiceTwo = "";
		String choiceThree = "";

		String correctAnswer = choiceTwo;

		// Write a print statement asking the question
		System.out.println(question);
		// Write a print statement giving the answer choices
		System.out.println(choiceOne);
		System.out.println(choiceTwo);
		System.out.println(choiceThree);

		try (// Have the user input an answer
				var scanner = new Scanner(System.in)) {
			// Retrieve the user's input
			input = scanner.nextLine();
		}
		// If the user's input matches the correctAnswer...
		if (input.equals(correctAnswer)) {
			// then the user is correct and we want to print out a congrats message to the
			// user.
			System.out.println("Congrats, its correct answer.");
		} else {
			// If the user's input does not match the correctAnswer...
			// then the user is incorrect and we want to print out a message saying that the
			// user is incorrect as well as what the correct choice was.
			System.out.println("Incorrect answer, correct is " + correctAnswer);
		}
	}
}