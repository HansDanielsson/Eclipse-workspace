package contactlist;

import java.util.Arrays;
import java.util.HashMap;

public class ContactList {

	public static void main(String[] args) {
		//Create a HashMap with Key telephone number and Value name of contanct.
		  
		HashMap<Integer,String> cont = new HashMap<>();


	      //Add 5 Contacts

		  cont.put(1, "Contact nr 1");
		  cont.put(2, "Contact nr 2");
		  cont.put(3, "Contact nr 3");
		  cont.put(4, "Contact nr 4");
		  cont.put(5, "Contact nr 5");
	      
	      //Print all the contacts
		  System.out.println("Contact list: " + cont);
		  cont.forEach((tel,vem) -> System.out.println("Telenr:" + tel + " Abonent: " + vem));
		  
		  int[] num = {3, 4, 1, 7, 2};
		  Arrays.sort(num);
		  System.out.println("Num : " + Arrays.toString(num));
	}
}