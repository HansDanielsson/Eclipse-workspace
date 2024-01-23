package plussminus;

public class PlussMinusProg {

	public static void main(String[] args) {
		int a = 8;
		int b;
		b = a-- + ++a;
		System.out.println("A = " + a);
		System.out.println("B = " + b);

		int c = 4;
		int d;
		d = c++;
		d = c--;
		d = ++c;
		d = c--;
		d = d * 10 + c;
		System.out.println("D = " + d);
	}
}