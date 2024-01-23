/**
 * 
 */
package humanpack;

/**
 * @author Hans
 *
 */
public class House {
	private int numberOfRooms;
	private int areaOfSpace;
	private String streetAddress;
	private String colorOfPaint;

	public House(int nOfRooms, int aOfSpace, String sAddress, String cOfPaint) {
		numberOfRooms = nOfRooms;
		areaOfSpace = aOfSpace;
		streetAddress = sAddress;
		colorOfPaint = cOfPaint;
	}

	public void printRooms() {
		System.out.println("Number of rooms is " + numberOfRooms);
	}

	public void printSpace() {
		System.out.println("The area is " + areaOfSpace);
	}

	public void printAddress() {
		System.out.println("Street address is " + streetAddress);
	}

	public void printColor() {
		System.out.println("House color is " + colorOfPaint);
	}
}