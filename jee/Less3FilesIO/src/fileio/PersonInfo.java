package fileio;

import java.io.Serializable;

public class PersonInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6632275257917992872L;
	private String name;
	private String eMail;
	private String phoneNr;
	
	public PersonInfo(String name, String eMail, String phoneNr) {
		this.name = name;
		this.eMail = eMail;
		this.phoneNr = phoneNr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public void setphoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	
	public String getphoneNr() {
		return phoneNr;
	}
	
	@Override
	public String toString() {
		return name + " " + eMail + " " + phoneNr;
	}
}