package classroom;

public class Classroom {

	private static int nextRoom = 101;
	private static int maxCapacity = 0;

	private int roomNumber;
	private int capacity;

	public Classroom(int capacity) {
		this.capacity = capacity;
		if (capacity > maxCapacity) {
			maxCapacity = capacity;
		}
		roomNumber = nextRoom++;
	}

	@Override
	public String toString() {
		return "Room Nr: " + roomNumber + " Capacity: " + capacity;
	}

	public static int getNumberOfClassroom() {
		return nextRoom - 101;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getClassroomNumber() {
		return roomNumber;
	}

	public static int getMaxCapacityClassroom() {
		return maxCapacity;
	}
}