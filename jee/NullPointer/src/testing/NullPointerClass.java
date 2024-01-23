/**
 * 
 */
package testing;

import java.util.ArrayList;

/**
 * @author Hans
 *
 */
public class NullPointerClass {
	ArrayList<Integer> ints;

	public NullPointerClass() {
		ints = new ArrayList<>();
	}

	public int getNumInts() {
		return ints.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NullPointerClass npc = new NullPointerClass();
		System.out.println(npc.getNumInts());
	}
}