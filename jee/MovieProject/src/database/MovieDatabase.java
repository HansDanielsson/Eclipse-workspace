package database;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
	// An ArrayList of movies.
	private ArrayList<Movie> movieList;
	// An ArrayList of actors.
	private ArrayList<Actor> actorList;

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(ArrayList<Movie> movieList) {
		this.movieList = movieList;
	}

	public List<Actor> getActorList() {
		return actorList;
	}

	public void setActorList(ArrayList<Actor> actorList) {
		this.actorList = actorList;
	}

	MovieDatabase() {
		movieList = new ArrayList<>();
		actorList = new ArrayList<>();
	}

	public void addMovie(String name, String[] actors) {
		int i = this.movieList.size();
		boolean noExist = true;
		while (noExist && i > 0)
			if (this.movieList.get(i).getName().equals(name))
				noExist = false;
			else
				i--;
		if (noExist) {
			Movie addM = new Movie(name, 0);
			movieList.add(addM);
		}
	}

	/**
	 * Add a rating for this movie Assume that the name argument will definitely be
	 * a name that is currently in the database.
	 * 
	 * @param name
	 * @param rating
	 */
	public void addRating(String name, double rating) {
		int i = this.movieList.size();
		boolean noExist = true;
		while (noExist && i > 0) {
			if (this.movieList.get(i).getName().equals(name)) {
				rating += this.movieList.get(i).getRating();
				this.movieList.get(i).setRating(rating);
				noExist = false;
			} else
				i--;
		}
	}

	/**
	 * Overwrite the current rating of a movie with this new rating. Again, assume
	 * that the name argument will definitely be a name that is currently in the
	 * database.
	 * 
	 * @param name
	 * @param newRating
	 */
	public void updateRating(String name, double newRating) {
		int i = this.movieList.size();
		boolean noExist = true;
		while (noExist && i > 0) {
			if (this.movieList.get(i).getName().equals(name)) {
				this.movieList.get(i).setRating(newRating);
				noExist = false;
			} else
				i--;
		}
	}

	/**
	 * Returns the name of the actor that has the best average rating for their
	 * movies.
	 * 
	 * @return the name
	 */
	public String getBestActor() {
		return "hej";
	}

	/**
	 * Returns the name of the movie with the highest rating.
	 * 
	 * @return
	 */
	public String getBestMovie() {
		return "hej";
	}
}