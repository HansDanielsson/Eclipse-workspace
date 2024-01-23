package refactoring;

import java.util.Date;

public abstract class Document {
	private String title;
	private String author;
	private Date date;
	public PublishingLocation publoc;
	
	public Document(String title, String author, Date date, String city, String state, String postCode) {
		publoc = new PublishingLocation(city, state, postCode);
		this.title = title;
		this.author = author;
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public Date getDate() {
		return date;
	}
	
	public boolean sameAuthor(Document article) {
		return this.author.equals(article.author);
	}
	
	public int compareDates(Document article) {
		return this.date.compareTo(article.date);
	}

	public int compareWithGeneralDate(Date date) {
		return this.date.compareTo(date);
	}
	
	public String getCity() {
		return publoc.getCity();
	}

	public String getState() {
		return publoc.getState();
	}

	public String getPostCode() {
		return publoc.getPostCode();
	}
}