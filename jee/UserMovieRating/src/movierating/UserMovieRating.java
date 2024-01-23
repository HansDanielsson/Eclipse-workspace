package movierating;

public class UserMovieRating implements Comparable<UserMovieRating> {

	protected String movie;
	protected int userRating;

	public UserMovieRating(String movie, int userRating) {
		this.movie = movie;
		this.userRating = userRating;
	}

	public String getMovie() {
		return movie;
	}

	public int getUserRating() {
		return userRating;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (getClass() != obj.getClass())
			return false;
		else if (this == obj)
			return true;
		UserMovieRating other = (UserMovieRating) obj;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		return (userRating == other.userRating);
	}

	@Override
	public int compareTo(UserMovieRating other) {
		return this.userRating - other.userRating;
	}
}