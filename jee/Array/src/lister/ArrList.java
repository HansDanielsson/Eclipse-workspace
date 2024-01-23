/**
 * 
 */
package lister;

import java.util.ArrayList;

/**
 * @author Hans
 *
 */
public class ArrList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> hosts = new ArrayList<>();
		hosts.add("www.google.com");
		hosts.add("www.upenn.edu");
		hosts.add("www.microsoft.com");
		hosts.add("www.amazon.com");

		for (String host : hosts) {
			if (host.endsWith("edu")) {
				System.out.println(host);
			} else {
				if (host.equals("www.amazon.com"))
					hosts.remove(host);
				hosts.add("PLACEHOLDER"); // kan inte lägga in saker under tiden, hosts låst i for sats
			}

		}
	}
}