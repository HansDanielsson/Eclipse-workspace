package timehelper;

public class TimeHelper {
	private int saveSeconds;

	public TimeHelper(int t) {
		saveSeconds = t;
	}

	public void inMinutes() {
		System.out.println(saveSeconds / 60);
	}

	public void inHours() {
		System.out.println(saveSeconds / 3600);
	}

	@Override
	public String toString() {
		var h = saveSeconds / 3600;
		var m = (saveSeconds - h * 3600) / 60;
		var s = (saveSeconds - h * 3600) - m * 60;
		var result = h + (h > 1 ? " hours " : " hour ");
		result += m + (m > 1 ? " minutes " : " minute ");
		result += s + (s > 1 ? " seconds " : " second ");
		return result;
	}
}
