package overriding;

public class OverridingExample {
	private int id;
	private String name;

	public OverridingExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		OverridingExample example = (OverridingExample) o;
		return id == example.id && name.equals(example.name);
	}

	@Override
	public String toString() {
		return "ID: " + id + "; Name: " + name;
	}

	private boolean equal(OverridingExample examlpe) {
		return id == examlpe.id && examlpe.name.equals(name);
	}

	public String tostring() {
		return "Name: " + name;
	}

	public static void main(String[] args) {
		OverridingExample e1 = new OverridingExample(0, "oops");
		OverridingExample e2 = e1;
		System.out.println(e1 == e2);
		String s1 = "bla";
		String s2 = "bl";
		s2 = s2 + "a";
		System.out.println(s1.equals(s2));
		String s3 = "bla";
		System.out.println(s1.equals(s3));
		System.out.println(e1);
		System.out.println(e1.tostring());
		OverridingExample e4 = new OverridingExample(1, s1);
		OverridingExample e5 = new OverridingExample(1, s3);
		System.out.println(e4.equal(e5));
		System.out.println("look: " + e1);
	}
}