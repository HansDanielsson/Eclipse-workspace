package library;

public class DramaPrintedBook extends PrintedBook {
	public DramaPrintedBook(String title, String author, int yearOfPublication, String time, String place,
			String dimensions, String weight) {
		super(title, author, yearOfPublication, time, place, dimensions, weight);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Weight: " + super.getWeight());
		System.out.println("Dimensions: " + super.getDimensions());
	}
}