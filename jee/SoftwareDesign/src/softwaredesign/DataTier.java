package softwaredesign;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * SD2x Homework #8
 * This class represents the Data Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

public class DataTier {
	private String fileName; // the name of the file to read

	public DataTier(String inputSource) {
		fileName = inputSource;
	}

	public List<Book> getAllBooks() {
		var bookList = new ArrayList<Book>();
		Book insertBook;
		String title;
		String author;
		int publicationYear;
		String line;
		int tabPos;
		try {
			var scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				try {
					line = scanner.nextLine();
					tabPos = line.indexOf('\t');
					title = line.substring(0, tabPos).trim();
					line = line.substring(tabPos + 1).trim();
					tabPos = line.indexOf('\t');
					author = line.substring(0, tabPos).trim();
					line = line.substring(tabPos + 1).trim();
					publicationYear = Integer.parseInt(line);

					insertBook = new Book(title, author, publicationYear);
					bookList.add(insertBook);
				} catch (Exception e) {
					// ignore exceptions
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return bookList;
	}
}