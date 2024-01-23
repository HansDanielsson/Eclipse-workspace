package database;

import java.util.ArrayList;

public class Actor {
	// The full name of the actor or actress.
		private String name;
		// ArrayList that has movies that this actor has acted in.
		private ArrayList<Movie> movies;
		
		Actor(String name) {
			this.name = name;
			this.movies = new ArrayList<>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Movie getMovies(int i) {
			return movies.get(i);
		}

		public void setMovies(Movie movies) {
			this.movies.add(movies);
		}
}