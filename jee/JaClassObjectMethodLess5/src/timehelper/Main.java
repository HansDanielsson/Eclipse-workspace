package timehelper;

public class Main {

	public static void main(String[] args) {
		var tihelp = new TimeHelper(3721);
		tihelp.inMinutes();
		tihelp.inHours();
		System.out.println(tihelp);

		var anotherHelp = new TimeHelper(7322);
		anotherHelp.inMinutes();
		anotherHelp.inHours();
		System.out.println(anotherHelp);
	}
}