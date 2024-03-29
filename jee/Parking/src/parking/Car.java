/**
 * 
 */
package parking;

/**
 * @author Hans
 *
 */
public class Car {
	// instance variables
	private String ownerName;
	private int ownerLicenceNum;
	private int registrationNum;

	private int parkingLoc;

	Car(String name, int licence, int registration) {
		ownerName = name;
		ownerLicenceNum = licence;
		registrationNum = registration;
	}

	public int getParkingLoc() {
		return parkingLoc;
	}

	public void setParkingLoc(int loc) {
		parkingLoc = loc;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerLicenceNum() {
		return ownerLicenceNum;
	}

	public int getRegistrationNum() {
		return registrationNum;
	}

	@Override
	public String toString() {
		// return string representation of a car.
		return ownerName + " owns car " + registrationNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Car carObj = (Car) obj;
		return this.registrationNum == carObj.registrationNum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 = new Car("abc", 123, 456);
		System.out.println(c1);
		Car c2 = new Car("abc", 123, 456);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	}
}