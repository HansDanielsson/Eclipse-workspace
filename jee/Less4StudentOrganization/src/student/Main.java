package student;

import java.util.Arrays;
import java.util.List;

public class Main {

	static final List<Student> students = Arrays.asList(
			new Student("Joe", "Clay", 1998, Gender.MALE),
			new Student("Marie", "Smith", 2001, Gender.FEMALE),
			new Student("Ann", "Thompson", 2004, Gender.FEMALE),
			new Student("James", "Bond", 1993, Gender.MALE),
			new Student("Jennifer", "Atkins", 1999, Gender.FEMALE),
			new Student("Cristina", "Gibbs", 2003, Gender.FEMALE),
			new Student("Jason", "Clark", 2002, Gender.MALE),
			new Student("Kate", "Barrett", 1996, Gender.FEMALE),
			new Student("Peter", "Garner", 2003, Gender.MALE),
			new Student("Ben", "Walsh", 2000, Gender.MALE));

	// Print the full names of each student.
	public static void runExample() {
		// students.stream().map(student ->
		// student.getName()).forEach(System.out::println);
		// System.out.println("Mitt exempel: ");
		students.forEach(st -> System.out.println(st.getName()));
	}

	// Print the list of each student's last name in uppercase.
	// Hint: map
	public static void runExercise1() {
		students.forEach(st -> System.out.println(st.getLastName().toUpperCase()));
	}

	// Print the first name of each male student.
	// Hint: filter
	public static void runExercise2() {
		students.stream().filter(st -> st.getGender() == Gender.MALE)
				.forEach(st -> System.out.println(st.getFirstName()));
	}

	// Print the full names and age of the first 5 students older than 20 years of
	// age.
	// Hint: limit
	public static void runExercise3() {
		students.stream().filter(st -> st.getAge() > 20).limit(5)
				.forEach(st -> System.out.println(st.getName() + " " + st.getAge()));
	}

	// Print the average age of students.
	// Hint: mapToInt average
	public static void runExercise4() {
		System.out.println(students.stream().mapToInt(st -> st.getAge()).average());
	}

	// Print the amount of students who are over 22 years old.
	// Hint: count
	public static void runExercise5() {
		System.out.println(students.stream().filter(st -> st.getAge() > 22).count());
	}

	// Print a list of age and student name sorted by age.
	// Hint: sorter
	public static void runExercise6() {
	}

	// Print a list of students older than 20 years sorted alphabetically with the
	// following format: Lastname, Firstname.
	// Hint: sorter
	public static void runExercise7() {

	}

	// Make a list of objects type integer with the different years when students
	// were born, sorted descendingly.
	// Hint: distinct reverseOrder collect
	public static void runExercise8() {
		// List <Integer> years = ?;
		// System.out.println(years);
	}

	public static void main(String[] args) {
		System.out.println("----------Example---------");
		runExample();
		System.out.println("--------Exercise 1--------");
		runExercise1();
		System.out.println("--------Exercise 2--------");
		runExercise2();
		System.out.println("--------Exercise 3--------");
		runExercise3();
		System.out.println("--------Exercise 4--------");
		runExercise4();
		System.out.println("--------Exercise 5--------");
		runExercise5();
		System.out.println("--------Exercise 6--------");
		runExercise6();
		System.out.println("--------Exercise 7--------");
		runExercise7();
		System.out.println("--------Exercise 8--------");
		runExercise8();

		/*
		 * ANSWER
		 * 
		 * ----------Example--------- Joe Clay Marie Smith Ann Thompson James Bond
		 * Jennifer Atkins Cristina Gibbs Jason Clark Kate Barrett Peter Garner Ben
		 * Walsh --------Exercise 1-------- CLAY SMITH THOMPSON BOND ATKINS GIBBS CLARK
		 * BARRETT GARNER WALSH --------Exercise 2-------- Joe James Jason Peter Ben
		 * --------Exercise 3-------- Joe Clay 23 James Bond 28 Jennifer Atkins 22 Kate
		 * Barrett 25 Ben Walsh 21 --------Exercise 4-------- 21.1 --------Exercise
		 * 5-------- 3 --------Exercise 6-------- 17 Ann Thompson 18 Cristina Gibbs 18
		 * Peter Garner 19 Jason Clark 20 Marie Smith 21 Ben Walsh 22 Jennifer Atkins 23
		 * Joe Clay 25 Kate Barrett 28 James Bond --------Exercise 7-------- Atkins,
		 * Jennifer Barrett, Kate Bond, James Clay, Joe Walsh, Ben --------Exercise
		 * 8-------- [2004, 2003, 2002, 2001, 2000, 1999, 1998, 1996, 1993]
		 * 
		 */

	}
}