package library;

public class ScienceFictioneAudioBook extends eAudioBook {
	public ScienceFictioneAudioBook(String title, String author, int yearOfPublication, String subject,
			int numberOfTracks, String size) {
		super(title, author, yearOfPublication, subject, numberOfTracks, size);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Number of Tracks: " + super.getNumberOfTracks());
		System.out.println("Size: " + super.getSize());
	}
}