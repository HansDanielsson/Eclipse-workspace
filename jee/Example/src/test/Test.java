package test;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(3, "myCircle");
		System.out.println(circle);
		System.out.println("My area is: " + circle.calculateArea());
		System.out.println("My perimeter is: " + circle.calculatePerimeter());
	}
}