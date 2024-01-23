package triangle;

import java.util.Scanner;

public class TriangleArea {

	static Scanner input = new Scanner(System.in);

	public static double inputMsg(String msg) {
		System.out.print(msg + ": ");
		return input.nextDouble();
	}

	public static void calculateTriangleArea() {
		try {
			var width = inputMsg("Enter the width of the triangle");
			var height = inputMsg("Enter the height of the triangle");
			var calculatedArea = width * height / 2;
			System.out.println("The triangle area = " + calculatedArea);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		calculateTriangleArea();
	}
}