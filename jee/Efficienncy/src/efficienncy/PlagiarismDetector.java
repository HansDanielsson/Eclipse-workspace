/**
 * 
 */
package efficienncy;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Hans
 *
 */

/*
 * SD2x Homework #11 Improve the efficiency of the code below according to the
 * guidelines in the assignment description. Please be sure not to change the
 * signature of the detectPlagiarism method! However, you may modify the
 * signatures of any of the other methods as needed.
 */

public class PlagiarismDetector {

	public static Map<String, Integer> detectPlagiarism(String dirName, int windowSize, int threshold) {
		String file1;
		String file2;
		Set<String> file1Phrases;
		Set<String> file2Phrases;
		Set<String> matches;
		File dirFile = new File(dirName);
		String[] files = dirFile.list();

		Map<String, Integer> numberOfMatches = new HashMap<>();

		for (int i = 0; i < files.length - 1; i++) {
			file1 = files[i];

			for (int j = i + 1; j < files.length; j++) {
				file2 = files[j];

				file1Phrases = createPhrases(dirName + "\\" + file1, windowSize);
				file2Phrases = createPhrases(dirName + "\\" + file2, windowSize);

				if (file1Phrases == null || file2Phrases == null)
					return null;

				matches = findMatches(file1Phrases, file2Phrases);

				if (matches.size() > threshold) {
					String key = file1 + "-" + file2;
					numberOfMatches.put(key, matches.size());
				}
			}
		}

		return sortResults(numberOfMatches);

	}

	/*
	 * This method reads the given file and then converts it into a Collection of
	 * Strings. It does not include punctuation and converts all words in the file
	 * to uppercase.
	 */
	protected static List<String> readFile(String filename) {
		if (filename == null)
			return null;

		var words = new LinkedList<String>();

		try {
			Scanner in = new Scanner(new File(filename));
			while (in.hasNext())
				words.add(in.next().replaceAll("[^a-zA-Z]", "").toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return words;
	}

	/*
	 * This method reads a file and converts it into a Set/List of distinct phrases,
	 * each of size "window". The Strings in each phrase are whitespace-separated.
	 */
	protected static Set<String> createPhrases(String filename, int window) {
		if (filename == null || window < 1)
			return null;

		var words = readFile(filename);
		Set<String> phrases = new HashSet<>();
		String phrase = "";

		for (int k = 0; k < window; k++)
			phrase += words.get(k) + " ";
		phrases.add(phrase);

		for (int i = 0; i < words.size() - window; i++) {
			phrase = phrase.substring(phrase.indexOf(' ') + 1) + words.get(window + i) + " ";
			phrases.add(phrase);
		}
		return phrases;
	}

	/*
	 * Returns a Set of Strings that occur in both of the Set parameters. However,
	 * the comparison is case-insensitive.
	 */
	protected static Set<String> findMatches(Set<String> myPhrases, Set<String> yourPhrases) {

		Set<String> matches = new HashSet<>();

		if (myPhrases != null && yourPhrases != null)
			for (String mine : myPhrases)
				for (String yours : yourPhrases)
					if (mine.equals(yours))
						matches.add(mine);
		return matches;
	}

	/*
	 * Returns a LinkedHashMap in which the elements of the Map parameter are sorted
	 * according to the value of the Integer, in non-ascending order.
	 */
	protected static LinkedHashMap<String, Integer> sortResults(Map<String, Integer> possibleMatches) {

		// Because this approach modifies the Map as a side effect of printing
		// the results, it is necessary to make a copy of the original Map
		var copy = new HashMap<String, Integer>(possibleMatches);
		var list = new LinkedHashMap<String, Integer>();
		int maxValue;
		int copykey;
		String maxKey;

		for (int i = 0; i < copy.size(); i++) {
			maxValue = 0;
			maxKey = null;
			for (String key : copy.keySet()) {
				copykey = copy.get(key);
				if (copykey > maxValue) {
					maxValue = copykey;
					maxKey = key;
				}
			}

			list.put(maxKey, maxValue);
			copy.put(maxKey, -1);
		}

		return list;
	}

	/*
	 * This method is here to help you measure the execution time and get the output
	 * of the program. You do not need to consider it for improving the efficiency
	 * of the detectPlagiarism method.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please specify the name of the directory containing the corpus.");
			System.exit(0);
		}
		String directory = args[0];
		long start = System.currentTimeMillis();
		var map = PlagiarismDetector.detectPlagiarism(directory, 4, 5);
		long end = System.currentTimeMillis();
		double timeInSeconds = (end - start) / (double) 1000;
		System.out.println("Execution time (wall clock): " + timeInSeconds + " seconds");
		for (var detectPlag : map.keySet())
			System.out.println(detectPlag + ": " + map.get(detectPlag));
	}
}