package database;

import java.util.ArrayList;

public class Movie {
	// The name of the movie
	private String name;
	// ArrayList of the actors in the movie.
	private ArrayList<Actor> actors;
	// A freshness rating from rotten tomatoes.
	private double rating;

	Movie(String name, double rating) {
		this.name = name;
		this.rating = rating;
		this.actors = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Actor getActors(int i) {
		return actors.get(i);
	}

	public void setActors(Actor actors) {
		this.actors.add(actors);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}