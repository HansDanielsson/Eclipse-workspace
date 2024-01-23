package mult;

public class Customer {
	public int id;
	public int timetodecide;
	public String desiredfood;

	public Customer(int id, int timetodecide, String desiredfood) {
		this.id = id;
		this.timetodecide = timetodecide;
		this.desiredfood = desiredfood;
	}

	@Override
	public String toString() {
		return "Customer #" + id;
	}
}