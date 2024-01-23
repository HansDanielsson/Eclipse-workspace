/**
 * 
 */
package ironmanpack;

/**
 * @author Hans
 *
 */
public class IronMan {
	
	private String id = "?";

	public IronMan() {
	}

	public IronMan(String newID) {
		id = newID;
	}

	private void dance() {
		System.out.println("You must be joking +_+");
	}

	public void cleanSlateProtocol() {
		System.out.println("3 ... 2 ... 1 ... BOOM!");
	}

	public void setID(String givenId) {
		id = givenId;
	}

	public String getName() {
		return "Mark " + id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IronMan defaultIronMan = new IronMan();
		String name = defaultIronMan.getName();
		System.out.println("This is: " + name);

		IronMan mark42 = new IronMan("42");
		System.out.println("This is: " + mark42.getName());
		mark42.dance();
		mark42.cleanSlateProtocol();
	}
}