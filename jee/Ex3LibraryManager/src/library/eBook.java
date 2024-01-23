package library;

public class eBook extends ScienceFictionBook {
	private String size;

	public eBook(String title, String author, int yearOfPublication, String subject, String size) {
		super(title, author, yearOfPublication, subject);
		this.size = size;
	}

	public String getSize() {
		return size;
	}
}