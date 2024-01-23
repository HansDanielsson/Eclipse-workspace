package classroom;

public class Main {

	public static void main(String[] args) {
		var c1 = new Classroom(25);
		var c2 = new Classroom(30);
		var c3 = new Classroom(15);

		System.out.println("Number of room: " + Classroom.getNumberOfClassroom());
		System.out.println("Number of max capacity: " + Classroom.getMaxCapacityClassroom());

		System.out.println(c1);
		System.out.print("RoomNr: " + c1.getClassroomNumber());
		System.out.println(" Capacity: " + c1.getCapacity());

		System.out.println(c2);
		System.out.print("RoomNr: " + c2.getClassroomNumber());
		System.out.println(" Capacity: " + c2.getCapacity());

		System.out.println(c3);
		System.out.print("RoomNr: " + c3.getClassroomNumber());
		System.out.println(" Capacity: " + c3.getCapacity());
	}
}