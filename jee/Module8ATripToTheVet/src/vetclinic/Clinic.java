package vetclinic;

import java.io.File;
import java.io.FileNotFoundException;

public class Clinic {
	public File patientFile;
	private int day;

	public Clinic(File inFile) {
		patientFile = inFile;
		// more to code
		day = 1;
	}

	public Clinic(String fileName) {
		this(new File(fileName));
	}

	public String nextDay(File inFile) throws FileNotFoundException {
		return "hej";
	}

	public String nextDay(String inFileName) throws FileNotFoundException {
		return "hej";
	}

	public boolean addToFile(String inPatientInfo) {
		boolean result = false;
		return result;
	}

	private String addTime(String inTimeIn, int inTreatmentTime) {
		String timeOut;
		timeOut = "New time";
		return timeOut;
	}
}