package student;

public class Student {
	private String firstName;
	private String lastName;
	private int expectYeartoGraduate;
	private double gpa;
	private String declaredMajor;

	public Student(String firstName, String lastName, int expectYeartoGradate, double gpa, String declaredMajor) {
		setFirstName(firstName);
		setLastName(lastName);
		setExpectYeartoGraduate(expectYeartoGradate);
		setGPA(gpa);
		setDeclaredMajor(declaredMajor);
	}

	public void incrementExpectedGraduationYear() {
		expectYeartoGraduate++;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String inFirstName) {
		firstName = inFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String inLastName) {
		lastName = inLastName;
	}

	public int getExpectYeartoGraduate() {
		return expectYeartoGraduate;
	}

	public void setExpectYeartoGraduate(int inExpectYeartoGraduate) {
		expectYeartoGraduate = inExpectYeartoGraduate;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gPA) {
		gpa = gPA;
	}

	public String getDeclaredMajor() {
		return declaredMajor;
	}

	public void setDeclaredMajor(String inDeclaredMajor) {
		declaredMajor = inDeclaredMajor;
	}
}