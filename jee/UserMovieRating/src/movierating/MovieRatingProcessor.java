package movierating;

/*
 * SD2x Homework #5
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MovieRatingProcessor {
	
	public static List<String> getAlphabeticalMovies(TreeMap<String, PriorityQueue<Integer>> movieRatings) {
		var alpabetical = new ArrayList<String>();
		if ((movieRatings != null) && (!movieRatings.isEmpty()))
			for (String string : movieRatings.keySet())
				alpabetical.add(string);
		return alpabetical; // this line is here only so this code will compile if you don't modify it
	}

	public static List<String> getAlphabeticalMoviesAboveRating(TreeMap<String, PriorityQueue<Integer>> movieRatings,
			int rating) {
		var alpabetical = new ArrayList<String>();
		if ((movieRatings != null) && (!movieRatings.isEmpty()))
			for (var entry : movieRatings.entrySet())
				if (entry.getValue().peek() > rating)
					alpabetical.add(entry.getKey());
		return alpabetical; // this line is here only so this code will compile if you don't modify it
	}

	public static TreeMap<String, Integer> removeAllRatingsBelow(TreeMap<String, PriorityQueue<Integer>> movieRatings,
			int rating) {
		var removeAllRatings = new TreeMap<String, Integer>();
		if ((movieRatings != null) && (!movieRatings.isEmpty())) {
			int counter;
			String entryKey;
			var movieSet = new TreeMap<String, PriorityQueue<Integer>>(movieRatings).entrySet();
			for (var entry : movieSet) {
				counter = 0;
				var newQueue = new PriorityQueue<Integer>();
				for (var intVal : entry.getValue())
					if (intVal < rating)
						counter++;
					else
						newQueue.add(intVal);
				entryKey = entry.getKey();
				if (newQueue.isEmpty())
					movieRatings.remove(entryKey);
				else
					movieRatings.put(entryKey, newQueue);
				if (counter > 0)
					removeAllRatings.put(entryKey, counter);
			}
		}
		return removeAllRatings; // this line is here only so this code will compile if you don't modify it
	}
}