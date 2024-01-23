package library;

public class PrintedBook extends DramaBook {
	private String dimensions;
	private String weight;

	public PrintedBook(String title, String author, int yearOfPublication, String time, String place, String dimensions,
			String weight) {
		super(title, author, yearOfPublication, time, place);
		this.dimensions = dimensions;
		this.weight = weight;
	}

	public String getDimensions() {
		return dimensions;
	}

	public String getWeight() {
		return weight;
	}
}