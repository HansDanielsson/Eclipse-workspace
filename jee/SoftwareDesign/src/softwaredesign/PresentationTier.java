package softwaredesign;

import java.util.Scanner;

/*
 * SD2x Homework #8
 * This class represents the Presentation Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below. 
 * Also implement the start method as described in the assignment description.
 */

public class PresentationTier {

	private LogicTier logicTier; // link to the Logic Tier

	public PresentationTier(LogicTier logicTier) {
		this.logicTier = logicTier;
	}

	/**
	 * Rutin som inputtar, fungerar inte perfekt
	 * 
	 * @param msg
	 * @return
	 */
	private static String messageInput(String msg) {
		String printInput;
		System.out.print(msg);
		try (var scanner = new Scanner(System.in)) {
			printInput = scanner.useDelimiter("\\A").nextLine();
		} catch (Exception e) {
			printInput = "N";
		}
		return printInput;
	}

	public void showBookTitlesByAuthor() {
		String author = messageInput("Enter Author's name :");
		var bookTitles = logicTier.findBookTitlesByAuthor(author);
		for (var enBook : bookTitles)
			System.out.println(enBook);
	}

	public void showNumberOfBooksInYear() {
		String publication = messageInput("Enter public Year :");
		var publicationYear = Integer.parseInt(publication);
		System.out.println("Number of books in Year " + publicationYear);
		System.out.println("is :" + logicTier.findNumberOfBooksInYear(publicationYear));
	}

	public void start() {
		String menyValue;
		boolean continueOk = true;
		while (continueOk) {
			menyValue = messageInput("Meny 1 = Author 2 = Year :");
			if (menyValue.equals("1")) {
				showBookTitlesByAuthor();
			} else {
				showNumberOfBooksInYear();
			}
			menyValue = messageInput("New search (N/Y) :");
			if (menyValue.equalsIgnoreCase("n")) {
				continueOk = false;
			}
		}

	}
}