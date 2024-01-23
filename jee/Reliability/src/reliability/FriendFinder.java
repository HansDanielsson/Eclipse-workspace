package reliability;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FriendFinder {
	protected ClassesDataSource classesDataSource;
	protected StudentsDataSource studentsDataSource;

	public FriendFinder(ClassesDataSource cds, StudentsDataSource sds) {
		classesDataSource = cds;
		studentsDataSource = sds;
	}

	public Set<String> findClassmates(Student theStudent) {

		if (theStudent == null)
			throw new IllegalArgumentException();
		String name = theStudent.getName();
		if (name == null)
			throw new IllegalArgumentException();
		else if (studentsDataSource == null)
			throw new IllegalStateException();
		else if (classesDataSource == null)
			throw new IllegalStateException();
		// find the classes that this student is taking
		List<String> myClasses = classesDataSource.getClasses(name);

		Set<String> classmates = new HashSet<>();

		// use the classes to find the names of the students
		if (myClasses != null)
			for (String myClass : myClasses) {
				// list all the students in the class
				List<Student> students = studentsDataSource.getStudents(myClass);
				if (students != null)
					for (Student student : students)
						if ((student != null) && (student.getName() != null)) {
							// find the other classes that they're taking
							List<String> theirClasses = classesDataSource.getClasses(student.getName());
							if (theirClasses != null) {

								// see if all of the classes that they're taking are the same as the ones this
								// student is taking
								boolean same = true;
								for (String c : myClasses)
									if (!theirClasses.contains(c)) {
										same = false;
										break;
									}
								if (same || (!student.getName().equals(name)
										&& !classmates.contains(student.getName())))
									classmates.add(student.getName());
							}
						}
			}

		if (classmates.isEmpty()) {
			return null;
		} else
			return classmates;
	}
}