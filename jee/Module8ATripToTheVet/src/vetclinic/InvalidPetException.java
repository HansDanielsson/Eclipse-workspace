package vetclinic;

public class InvalidPetException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3829225162472728646L;

	public InvalidPetException(String s) {
		super(s);
	}

	public InvalidPetException() {
		this("Your pet is invalid!");
	}
}