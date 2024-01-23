package space;

public class Gameplay {

	public static void main(String[] args) {
		BlueAstronaut bob = new BlueAstronaut("Bob", 20, 6, 30);
		BlueAstronaut heath = new BlueAstronaut("Heath", 30, 3, 21);
		BlueAstronaut albert = new BlueAstronaut("Albert", 44, 2, 0);
		BlueAstronaut angel = new BlueAstronaut("Angel", 0, 1, 0);
		// BlueAstronaut pl = new BlueAstronaut("Test", 10, 20, 30);

		RedAstronaut liam = new RedAstronaut("Liam", 19, "experienced");
		RedAstronaut suspicPerson = new RedAstronaut("Suspicious Person", 100, "expert");

		// 1:
		System.out.println("--- 1 ---");
		liam.sabotage(bob);
		System.out.println(bob);

		// 2:
		System.out.println("--- 2 ---");
		System.out.println(liam);
		System.out.println(suspicPerson);
		liam.freeze(suspicPerson);
		System.out.println(liam);
		System.out.println(suspicPerson);

		// 3:
		System.out.println("--- 3 ---");
		System.out.println(liam);
		System.out.println(albert);
		liam.freeze(albert);
		System.out.println(liam);
		System.out.println(albert);

		// 4:
		System.out.println("--- 4 ---");
		albert.emergencyMeeting();

		// 5:
		System.out.println("--- 5 ---");
		System.out.println(bob);
		System.out.println(heath);
		suspicPerson.emergencyMeeting();
		System.out.println(bob);
		System.out.println(heath);

		// 6:
		System.out.println("--- 6 ---");
		bob.emergencyMeeting();
		System.out.println(suspicPerson);

		// 7:
		System.out.println("--- 7 ---");
		heath.completeTask();
		System.out.println(heath);

		// 8:
		System.out.println("--- 8 ---");
		heath.completeTask();
		System.out.println(heath);

		// 9:
		System.out.println("--- 9 ---");
		heath.completeTask();
		System.out.println(heath);

		// 10:
		System.out.println("--- 10 ---");
		System.out.println(liam);
		System.out.println(angel);
		liam.freeze(angel);
		System.out.println(liam);
		System.out.println(angel);

		// 11:
		System.out.println("--- 11 ---");
		System.out.println(liam);
		System.out.println(bob);
		liam.sabotage(bob);
		System.out.println(bob);
		liam.sabotage(bob);
		System.out.println(liam);
		System.out.println(bob);

		// 12:
		System.out.println("--- 12 ---");
		System.out.println(liam);
		System.out.println(bob);
		liam.freeze(bob);
		System.out.println(liam);
		System.out.println(bob);

		// 13:
		// System.out.println(liam);
		// angel.emergencyMeeting();
		// System.out.println(liam);

		// 14:
		System.out.println("--- 14 ---");
		System.out.println(liam);
		System.out.println(heath);
		liam.sabotage(heath);
		System.out.println(heath);
		liam.sabotage(heath);
		System.out.println(heath);
		liam.sabotage(heath);
		System.out.println(heath);
		liam.sabotage(heath);
		System.out.println(heath);
		liam.sabotage(heath);
		System.out.println(heath);

		// 15:
		System.out.println("--- 15 ---");
		System.out.println(liam);
		System.out.println(heath);
		liam.freeze(heath);
		System.out.println(liam);
		System.out.println(heath);
	}
}