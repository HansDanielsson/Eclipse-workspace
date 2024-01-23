package library;

public class eAudioBook extends eBook {
	private int numberOfTracks;

	public eAudioBook(String title, String author, int yearOfPublication, String subject, int numberOfTracks,
			String size) {
		super(title, author, yearOfPublication, subject, size);
		this.numberOfTracks = numberOfTracks;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}
}