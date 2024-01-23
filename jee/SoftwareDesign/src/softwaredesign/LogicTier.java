package softwaredesign;

import java.util.HashSet;
import java.util.Set;

/*
 * SD2x Homework #8
 * This class represents the Logic Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

public class LogicTier {
	
	private DataTier dataTier; // link to the Data Tier

	public LogicTier(DataTier dataTier) {
		this.dataTier = dataTier;
	}

	public Set<String> findBookTitlesByAuthor(String author) {
		Set<String> titleByAuthor = new HashSet<>();
		var allBooks = dataTier.getAllBooks();
		for (var enBook : allBooks)
			if (enBook.getAuthor().indexOf(author) > -1)
				titleByAuthor.add(enBook.getTitle());
		return titleByAuthor;
	}

	public int findNumberOfBooksInYear(int publicationYear) {
		int result = 0;
		var allBooks = dataTier.getAllBooks();
		for (var enBook : allBooks)
			if (enBook.getPublicationYear() == publicationYear)
				result++;
		return result;
	}
}