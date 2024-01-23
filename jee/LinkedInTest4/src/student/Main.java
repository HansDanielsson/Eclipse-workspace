package student;

public class Main {

	public static void main(String[] args) {
		var stu1 = new Student("First1", "Last1", 2022, 12.34, "declared");
		var stu2 = new Student("First2", "Last2", 2023, 34.12, "Studing studing");
		stu1.incrementExpectedGraduationYear();
		
		System.out.println("Student1 : " + stu1.getFirstName() + " " + stu1.getExpectYeartoGraduate());
		System.out.println("Student2 : " + stu2.getFirstName() + " " + stu2.getExpectYeartoGraduate());
	}
}