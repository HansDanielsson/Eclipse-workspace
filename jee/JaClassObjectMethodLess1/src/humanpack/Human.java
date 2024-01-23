/**
 * 
 */
package humanpack;

import java.util.Calendar;

/**
 * @author Hans
 *
 */
public class Human {
	char gender;
	String firstNames;
	String lastName;
	Human partner;
	int identificationNumber;
	int yearBirth;
	int monthBirth;
	int dayBirth;

	public Human(String firstNames, String lastName, char gender) {
		this.firstNames = firstNames;
		this.lastName = lastName;
		this.gender = gender;
	}

	public void speak(String words) {
		System.out.println(words);
	}

	public void addPartner(Human humanCouple) {
		this.partner = humanCouple;
		humanCouple.partner = this;
	}

	public Human getPartner() {
		return this.partner;
	}

	public void setId(int id) {
		identificationNumber = id;
	}

	public int getId() {
		return identificationNumber;
	}

	public void setBirthDate(int year, int month, int day) {
		yearBirth = year;
		monthBirth = month;
		dayBirth = day;
	}

	public String getFullName() {
		return this.firstNames + " " + this.lastName;
	}

	public int getAge() {

		Calendar today = Calendar.getInstance();

		// the current year represented by this date, minus 1900.
		int currentYear = today.get(Calendar.YEAR);
		int age = currentYear - yearBirth;

		// 0 is January, so add 1
		int currentMonth = today.get(Calendar.MONTH) + 1;
		if (currentMonth < monthBirth) {
			age--;
		} else if (currentMonth == monthBirth) {
			// day of the Month
			int currentDay = today.get(Calendar.DAY_OF_MONTH);
			if (dayBirth > currentDay) {
				age--;
			}
		}
		return age;
	}

	public String getPartnerName() {
		if (partner == null) {
			return "";
		} else {
			return this.getPartner().getFullName();
		}
	}
}