package movierating;

import java.util.List;

/*
 * SD2x Homework #5
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

import java.util.PriorityQueue;
import java.util.TreeMap;

public class MovieRatingParser {
	
	public static TreeMap<String, PriorityQueue<Integer>> parseMovieRatings(List<UserMovieRating> allUsersRatings) {
		var movieList = new TreeMap<String, PriorityQueue<Integer>>();
		String movie;
		int userRating;
		PriorityQueue<Integer> userQueue;
		if ((allUsersRatings != null) && (!allUsersRatings.isEmpty()))
			for (var userMovieRating : allUsersRatings)
				if ((userMovieRating != null) && (userMovieRating.movie != null) && (!userMovieRating.movie.isEmpty())
						&& (userMovieRating.userRating > -1)) {
					movie = userMovieRating.movie.toLowerCase();
					userRating = userMovieRating.userRating;
					userQueue = movieList.get(movie);
					if (userQueue == null)
						userQueue = new PriorityQueue<>();
					userQueue.add(userRating);
					movieList.put(movie, userQueue);
				}
		return movieList; // this line is here only so this code will compile if you don't modify it
	}
}